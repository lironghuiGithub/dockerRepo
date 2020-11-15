FROM centos
MAINTAINER lrh <1099303183@qq.com>
##jdk 压缩包名称
ENV JAVA_TAR_NAME jdk-8u212-linux-x64.tar.gz
##jdk解压后名称
ENV JAVA_UNTAR_NAME jdk1.8.0_212
# make a new directory to store the jdk files
RUN mkdir /usr/local/java
#设置时区
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
# copy the jdk  archive to the image,and it will automaticlly unzip the tar file
ADD ${JAVA_TAR_NAME} /usr/local/java/
# set environment variables
ENV JAVA_HOME /usr/local/java/${JAVA_UNTAR_NAME}
##设置jdk变量
ENV PATH ${JAVA_HOME}/bin:$PATH
