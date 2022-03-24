package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Validator;

import org.jboss.logging.Logger;

import io.quarkus.scheduler.Scheduled;

@ApplicationScoped
public class Scheduler {

    @Inject
    Logger log;

    @Inject
    Validator validator;

    @Scheduled(every = "5s", delayed = "5s")
    void scheduledMethod() {

    }
}
