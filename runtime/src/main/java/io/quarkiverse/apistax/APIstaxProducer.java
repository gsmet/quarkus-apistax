package io.quarkiverse.apistax;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class APIstaxProducer {

    @Inject
    APIstaxConfiguration configuration;

    @Produces
    @Dependent
    public APIstaxClient produceClient() {
        return new APIstaxClientImpl(configuration.apiKey);
    }
}
