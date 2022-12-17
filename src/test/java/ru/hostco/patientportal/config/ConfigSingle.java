package ru.hostco.patientportal.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigSingle {

    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

}
