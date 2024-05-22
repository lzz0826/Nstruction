# 使用 docker容器啟動java OpenJDK 8 作为基础镜像
FROM openjdk:8

# 暴露容器的 8090 端口
EXPOSE 8090

# 设置工作目录为 /root
WORKDIR /root

# 将 jar 文件添加到工作目录中，并重命名为 app.jar
ADD java-server/java*.jar /root/app.jar

# 设置容器启动时的入口点
ENTRYPOINT ["java", "-jar", "/root/app.jar"]
