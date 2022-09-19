#指定基础镜像，本地如果没有会从 dockerhub 上 pull 下来
FROM openjdk:8
#把可执行jar包复制到基础镜像的根目录下
ADD back-0.0.1-SNAPSHOT.jar /back-0.0.1-SNAPSHOT.jar
#容器需要暴露 给主机的端口号,这里的端口号和 项目配置文件中的端口号一致
EXPOSE 18000
#在镜像运行为容器后执行的命令
ENTRYPOINT ["java","-jar","/back-0.0.1-SNAPSHOT.jar"]
