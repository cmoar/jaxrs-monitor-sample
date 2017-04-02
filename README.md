[![Build Status](https://travis-ci.org/tnsasse/jaxrs-monitor-sample.svg?branch=master)](https://travis-ci.org/tnsasse/jaxrs-monitor-sample)

# jaxrs-monitor-sample
Sample application for [jaxrs-monitor](https://github.com/tnsasse/jaxrs-monitor).

## Build / Install
You can clone this repository and build it with maven:

    git clone https://github.com/tnsasse/jaxrs-monitor-sample.git
    cd jaxrs-monitor-sample
    mvn clean install

Drop the war file from `target/jaxrs-monitor-sample.war` into your application
server's deployment folder.

Navigate to `http://YOURHOST:PORT/jaxrs-monitor-sample/resources/ping`.
Check jaxrs-monitor at work at `http://YOURHOST:PORT/jaxrs-monitor-sample/resources/jaxrs-monitor`.
