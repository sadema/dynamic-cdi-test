FROM sadema/payara-micro
ENV ARCHIVE_NAME dynamic-cdi.war
COPY ./target/dynamic-cdi.war ${DEPLOYMENT_DIR}
ENTRYPOINT java -jar ${PAYARA_ARCHIVE}.jar --deploy ${ARCHIVE_NAME}
