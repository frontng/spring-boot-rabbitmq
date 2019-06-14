# Spring Boot RabbitMQ

## 1.安装RabbitMQ

````
#拉取docker镜像
docker pull rabbitmq:management

#运行容器
docker run -d --name rabbitmq 
 -p 5671:5671 -p 5672:5672  -p 15672:15672 -p 15671:15671 \
 -p 25672:25672 \
 -v /Users/front/docker/rabbitmq/data/:/var/rabbitmq/lib \
 -e RABBITMQ_DEFAULT_USER=admin \
 -e RABBITMQ_DEFAULT_PASS=123456 rabbitmq:management

````
RabbitMQ Web管理界面

http://localhost:15672


|用户名|密码|
|:-|:-:|
|admin|123456|


## 2.编译

````
cd spring-boot-rabbitmq
mvn install
````
### 3.1.运行订阅者端

````
mvn spring-boot:run -Dspring.profiles.active=tut1,receiver

````

### 3.2.运行消生产者端
````
mvn spring-boot:run -Dspring.profiles.active=tut1,sender
````
