package mapper.implicit;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.Test;

import dto.ConvertDto;
import dto.Dto;

public class ImplicitTypeConvertMapperTest {

    @Test
    public void primitive() {
        Dto dto = new Dto();
        dto.setIntValue(1);
        dto.setLongValue(100L);
        dto.setDoubleValue(30.5);
        dto.setBoolValue(true);

        ConvertDto convertDto = ImplicitTypeConvertMapper.MAPPER.toConvertDto(dto);

        assertThat(convertDto.getIntValue()).isEqualTo("1");
        assertThat(convertDto.getLongValue()).isEqualTo("100");
        assertThat(convertDto.getDoubleValue()).isEqualTo("30.5");
        assertThat(convertDto.getBoolValue()).isEqualTo("true");
    }

    @Test
    public void test() {
        Dto dto = new Dto();
        dto.setIntValue(1);
        dto.setLocalDateValue(LocalDate.of(2020, 1, 20));

        ConvertDto convertDto = ImplicitTypeConvertMapper.MAPPER.format(dto);

        assertThat(convertDto.getIntValue()).isEqualTo("001");
        assertThat(convertDto.getLocalDateValue()).isEqualTo("2020/01/20");
    }

}
