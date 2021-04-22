listen {
port = 4040

// "metrics_endpoint" can be used to configure an alternative metrics URL
// path. Default value is "/metrics".
//
//   metrics_endpoint = "/metrics"
}

namespace "nginx" {
    source = {
        files = [
            "/var/log/nginx/access_upstream.log"]
            }

format = "$remote_addr - $remote_user [$time_local] \"$request\" $status $body_bytes_sent \"$http_referer\" \"$http_user_agent\" rt=$request_time uct=\"$upstream_connect_time\" uht=\"$upstream_header_time\" urt=\"$upstream_response_time\""

//"$remote_addr - $remote_user [$time_local] \"$request\" $status $body_bytes_sent \"$http_referer\" \"$http_user_agent\" \"$http_x_forwarded_for\""


histogram_buckets = [.005, .01, .025, .05, .1, .25, .5, 1, 2.5, 5, 10]

}
