package ru.hostco.patientportal.api.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IndicatorValue {
    private Indicator indicator;
    private String minValue;
    private String maxValue;
}
