FROM java:8
VOLUME /tmp
ADD target/*.jar app.jar
# 设置上海时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
