conn = new Mongo();
db = conn.getDB("docker-compose")
db.createUser(
{
    user: "root",
    pwd: "jamg",
    roles: [
        {
            role: "readWrite",
            db: "docker-compose"
        }
    ]
}
);

db.user.insert([
{ userId: 'jamg', name: 'Juan' } ,
{ userId: 'annie', name: 'Anne' }
]);

