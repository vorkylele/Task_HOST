package ru.hostco.patientportal.api.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Indicator {
    private int id;
    private String name;
    private String unit;
}
