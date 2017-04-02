[![Build Status](https://travis-ci.org/tnsasse/jaxrs-monitor-sample.svg?branch=master)](https://travis-ci.org/tnsasse/jaxrs-monitor-sample)

# jaxrs-monitor-sample
Sample application for [jaxrs-monitor](https://github.com/tnsasse/jaxrs-monitor).

## Run on Docker
You can pull and run the public docker image like this:

    $ docker pull tnsasse/jaxrs-monitor-sample
    $ docker run -d -p 9080:9080 tnsasse/jaxrs-monitor-sample

Wait a couple of seconds for the app server to boot, then navigate to `http://localhost:9080/jaxrs-monitor-sample/resource/ping` and issue
some sample request. To view the jaxrs-monitor metrics go to `http://localhost:9080/jaxrs-monitor-sample/resources/jaxrs-monitor`.

## Build / Install
You can clone this repository and build it with maven:

    git clone https://github.com/tnsasse/jaxrs-monitor-sample.git
    cd jaxrs-monitor-sample
    mvn clean install

Drop the war file from `target/jaxrs-monitor-sample.war` into your application
server's deployment folder.