package ru.hostco.patientportal.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:default.properties"})
public interface ProjectConfig extends Config {

    @Key("base.uri")
    @DefaultValue("https://pp86.hostco.ru")
    String getBaseUriProperties();

    @Key("base.api.path")
    @DefaultValue("/api/pp/rest")
    String getBaseApiPathProperties();

    @Key("base.uri.login")
    @DefaultValue("https://cas-test.hostco.ru")
    String getBaseUriLoginProperties();

    @Key("base.username")
    @DefaultValue("71450643575")
    String getUsername();

    @Key("base.password")
    @DefaultValue("123")
    String getPassword();
}
