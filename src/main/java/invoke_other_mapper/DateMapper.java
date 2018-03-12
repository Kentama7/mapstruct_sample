package invoke_other_mapper;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateMapper {

    public String asString(LocalDate date) {
        return date != null ? date.format(DateTimeFormatter.ISO_DATE) : null;
    }

    public LocalDate asDate(String date) throws ParseException {
        return date != null ? LocalDate.parse(date, DateTimeFormatter.ISO_DATE) : null;
    }
}
