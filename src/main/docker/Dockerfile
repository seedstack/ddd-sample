FROM java:alpine

EXPOSE 8080

COPY opt /opt
CMD exec java $JAVA_OPTS -jar /opt/bin/ddd-sample-capsule.jar
