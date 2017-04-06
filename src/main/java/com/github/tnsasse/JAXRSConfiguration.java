package com.github.tnsasse;

import com.github.tnsasse.boundary.PingResource;
import com.github.tnsasse.jaxrsmonitor.boundary.MonitoringConfiguration;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
@Stateless
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {

  @Inject
  MonitoringConfiguration configuration;

  @PostConstruct
  public void setConfiguration() {
    // These are all optional, too
    configuration.setAppMetricsEnabled(true);
    configuration.setSystemMetricsEnabled(true);
    configuration.setResponseMetricsEnabled(true);
    configuration.setMaxPathDepth(-1);

    Logger logger = Logger.getLogger(PingResource.class.getName());
    logger.info("App Metrics: " + configuration.isAppMetricsEnabled());
    logger.info("System Metrics: " + configuration.isSystemMetricsEnabled());
    logger.info("Response Metrics: " + configuration.isResponseMetricsEnabled());
  }

}
