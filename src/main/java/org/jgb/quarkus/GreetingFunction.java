package org.jgb.quarkus;

import javax.inject.Inject;
import io.quarkus.funqy.Funq;

public class GreetingFunction {

    @Inject
    GreetingService greetingService;

    @Funq
    public String greeting(String name) {
        return greetingService.greeting(name);
    }

    @Funq
    public String hello() {
        return "Hello Serverless";
    }
}
