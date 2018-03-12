package invoke_other_mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.Test;

import invoke_other_mapper.dto.Person;
import invoke_other_mapper.entity.PersonEntity;

public class PersonMapperTest {

    @Test
    public void dateAsString() {
        PersonEntity entity = new PersonEntity("マイケル", LocalDate.of(1963, 2, 17));

        Person person = PersonMapper.MAPPER.toPerson(entity);

        assertThat(person.getName()).isEqualTo("マイケル");
        assertThat(person.getBirthday()).isEqualTo("1963-02-17");
    }

    @Test
    public void stringAsDate() {
        Person person = new Person("マイケル", "1963-02-17");

        PersonEntity entity = PersonMapper.MAPPER.toPersonEnity(person);

        assertThat(entity.getName()).isEqualTo("マイケル");
        assertThat(entity.getBirthday()).isEqualTo(LocalDate.of(1963, 2, 17));
    }
}
