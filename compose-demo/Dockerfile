# Docker image for springboot file run
# VERSION 0.0.1
# Author: lrh
# 基础镜像使用java
FROM centos-jdk
# 作者
MAINTAINER eangulee <1099303183@qq.com>
# VOLUME 指定了临时文件目录为/tmp。
# VOLUME /tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /lrh/springboot/app /AEApps
# 将jar包添加到容器中并更名为app.jar
ADD app.jar /AEApps/app.jar

ENV JAVA_OPS="-Xms512m -Xmx512m"

ENTRYPOINT java ${JAVA_OPS} -Djava.security.egd=file:/dev/./urandom -jar /AEApps/app.jar
