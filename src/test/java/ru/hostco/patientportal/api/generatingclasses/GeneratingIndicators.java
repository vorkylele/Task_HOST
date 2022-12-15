package ru.hostco.patientportal.api.generatingclasses;

import ru.hostco.patientportal.api.models.Indicator;
import ru.hostco.patientportal.api.models.IndicatorValue;

import java.util.List;

import static ru.hostco.patientportal.data.TestData.DataOfParametersOfHealthIndicators.*;

public class GeneratingIndicators {
    public static List<IndicatorValue> getAllIndicators() {
        return List.of(IndicatorValue.builder()
                .maxValue(MAX_VALUE_OF_AMBIVALENCE)
                .minValue(MIN_VALUE_OF_AMBIVALENCE)
                .indicator(Indicator.builder()
                        .id(ID_OF_AMBIVALENCE)
                        .name(NAME_OF_AMBIVALENCE)
                        .unit(UNIT_OF_AMBIVALENCE)
                        .build())
                .build(),
                IndicatorValue.builder()
                        .maxValue(MAX_VALUE_OF_ALCOHOL_IN_THE_BLOOD)
                        .minValue(MIN_VALUE_OF_ALCOHOL_IN_THE_BLOOD)
                        .indicator(Indicator.builder()
                                .id(ID_OF_ALCOHOL_IN_THE_BLOOD)
                                .name(NAME_OF_ALCOHOL_IN_THE_BLOOD)
                                .unit(UNIT_OF_ALCOHOL_IN_THE_BLOOD)
                                .build())
                        .build(),
                IndicatorValue.builder()
                        .maxValue(MAX_VALUE_OF_TEMPERATURE)
                        .minValue(MIN_VALUE_OF_TEMPERATURE)
                        .indicator(Indicator.builder()
                                .id(ID_OF_TEMPERATURE)
                                .name(NAME_OF_TEMPERATURE)
                                .unit(UNIT_OF_TEMPERATURE)
                                .build())
                        .build(),
                IndicatorValue.builder()
                        .maxValue(MAX_VALUE_OF_WEIGHT)
                        .minValue(MIN_VALUE_OF_WEIGHT)
                        .indicator(Indicator.builder()
                                .id(ID_OF_WEIGHT)
                                .name(NAME_OF_WEIGHT)
                                .unit(UNIT_OF_WEIGHT)
                                .build())
                        .build(),
                IndicatorValue.builder()
                        .maxValue(MAX_VALUE_OF_PRESSURE)
                        .minValue(MIN_VALUE_OF_PRESSURE)
                        .indicator(Indicator.builder()
                                .id(ID_OF_PRESSURE)
                                .name(NAME_OF_PRESSURE)
                                .unit(UNIT_OF_PRESSURE)
                                .build())
                        .build(),
                IndicatorValue.builder()
                        .maxValue(MAX_VALUE_OF_BLOOD_SUGAR_LEVELS)
                        .minValue(MIN_VALUE_OF_BLOOD_SUGAR_LEVELS)
                        .indicator(Indicator.builder()
                                .id(ID_OF_BLOOD_SUGAR_LEVELS)
                                .name(NAME_OF_BLOOD_SUGAR_LEVELS)
                                .unit(UNIT_OF_BLOOD_SUGAR_LEVELS)
                                .build())
                        .build(),
                IndicatorValue.builder()
                        .maxValue(MAX_VALUE_OF_PULSE)
                        .minValue(MIN_VALUE_OF_PULSE)
                        .indicator(Indicator.builder()
                                .id(ID_OF_PULSE)
                                .name(NAME_OF_PULSE)
                                .unit(UNIT_OF_PULSE)
                                .build())
                        .build()
                );
    }
}
