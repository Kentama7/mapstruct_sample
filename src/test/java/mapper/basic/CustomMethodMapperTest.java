package mapper.basic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dto.Person;
import entity.PersonEntity;

public class CustomMethodMapperTest {

    @Test
    public void test() {
        PersonEntity entity = new PersonEntity("マイケル", 23);

        Person person = CustomMethodMapper.MAPPER.toPerson(entity);

        assertThat(person.getName()).isEqualTo("マイケル!!");
        assertThat(person.getAge()).isEqualTo(123);
    }

}
