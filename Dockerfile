FROM airhacks/glassfish
COPY ./target/smarkt.war ${DEPLOYMENT_DIR}
