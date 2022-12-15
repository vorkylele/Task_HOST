package ru.hostco.patientportal.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ReceiveOfData {
    public String getLocalDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm", Locale.ENGLISH);
        return LocalDateTime.now().format(formatter);
    }
}
