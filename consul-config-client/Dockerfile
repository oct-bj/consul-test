FROM java:8-jre

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ADD ./target/consul-config-client-0.4.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/consul-config-client-0.4.jar"]

EXPOSE 9101
