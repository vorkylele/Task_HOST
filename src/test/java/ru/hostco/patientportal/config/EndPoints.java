package ru.hostco.patientportal.config;

public class EndPoints {
    public static final String LOGIN = "/realms/esia/protocol/cas/login?service=https%3A%2F%2Fpp86.hostco.ru%2Fapi%2Fpp%2Fauth%2Fverify%3FredirectURI%3Dhttps%253A%252F%252Fcas-release-pg.hostco.ru%252Fcas%252Flogin%253Fservice%253Dhttps%25253A%25252F%25252Fpp86.hostco.ru%25252Fapi%25252Fpatient%25252Fauth%25252Fesia%25252Fverify%25253FredirectURI%25253Dhttps%2525253A%2525252F%2525252Fpp86.hostco.ru%2525253A%2525252Fcallback";
    public static final String HEALTH_INDICATORS = "/account/card/health";
    public static final String GET_INDICATORS = "/health";
    public static final String DELETE_INDICATORS = "/health/delete/";
    public static final String SET_INDICATORS = "health/threshold/saveAll";

}
