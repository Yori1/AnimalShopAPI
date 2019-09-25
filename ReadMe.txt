This application runs in a docker container and depends on a mysql container to provide a database.
Run a mysql container like this:

docker run --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=animalShopDb1" mysql

build main application like this: 

mvn install dockerfile:build

run the main application like this:

docker run -t --name api --link docker-mysql:mysql -p 8080:8080 springio/api