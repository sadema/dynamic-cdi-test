FROM sadema/payara-micro
ENV ARCHIVE_NAME dynamic-cdi-1.0-SNAPSHOT.war
COPY ./target/dynamic-cdi-1.0-SNAPSHOT.war ${DEPLOYMENT_DIR}
ENTRYPOINT java -jar ${PAYARA_ARCHIVE}.jar --deploy ${ARCHIVE_NAME}
