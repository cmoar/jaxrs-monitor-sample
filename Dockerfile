FROM websphere-liberty:webProfile7
MAINTAINER Tobias N. Sasse (@tnsasse)
ENV DEPLOYMENT_DIR /config/dropins/
COPY target/jaxrs-monitor-sample.war ${DEPLOYMENT_DIR}
EXPOSE 9080
