package ru.hostco.patientportal.specifications;



import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.qameta.allure.restassured.AllureRestAssured;

import static ru.hostco.patientportal.config.ConfigSingle.config;

public class Specifications {

    private static final AllureRestAssured FILTER = new AllureRestAssured()
            .setRequestTemplate("request.ftl")
            .setResponseTemplate("response.ftl");

    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(config.getBaseUriProperties())
                .setBasePath(config.getBaseApiPathProperties())
                .setContentType("application/json")
                .addFilter(FILTER)
                .build();
    }

    public static RequestSpecification requestSpecificationGetDelete() {
        return new RequestSpecBuilder()
                .setBaseUri(config.getBaseUriProperties())
                .setBasePath(config.getBaseApiPathProperties())
                .addFilter(FILTER)
                .build();
    }
}
