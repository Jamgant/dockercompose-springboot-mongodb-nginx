conn = new Mongo();
db = conn.getDB("docker-compose");

db.createUser({
    user: "root",
    pwd: "secure",
    roles: [
        { role: "readWrite", db: "docker-compose" }
    ]
});
db.getSiblingDB("admin").createUser({
    user: "mongodb_exporter",
    pwd: "password",
    roles: [
        { role: "clusterMonitor", db: "admin" },
        { role: "read", db: "docker-compose" }
    ]
});

db.user.insert([
{ userId: 'jamg', name: 'Juan' } ,
{ userId: 'annie', name: 'Anne' }
]);

