package decorator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dto.Person;
import entity.PersonEntity;

public class PersonMapperTest {

    @Test
    public void test() {
        PersonEntity entity = new PersonEntity();
        entity.setName("curry");

        Person person = PersonMapper.MAPPER.toPerson(entity);

        assertThat(person.getName()).isEqualTo("CURRY");
    }

}
