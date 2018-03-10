package dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Dto {
    private int intValue;
    private long longValue;
    private double doubleValue;
    private boolean boolValue;
    private LocalDate localDateValue;
}
