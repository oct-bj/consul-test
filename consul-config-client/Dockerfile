FROM java:8-jre

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ADD ./target/consul-config-client-0.2.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/consul-config-client-0.2.jar"]

EXPOSE 9101
