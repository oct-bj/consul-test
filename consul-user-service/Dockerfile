FROM java:8-jre

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ADD ./target/consul-user-service-0.8.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/consul-user-service-0.8.jar"]

EXPOSE 8206