package context;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Locale;

import org.junit.Test;

import dto.Person;
import entity.PersonEntity;

public class ContextMapperTest {

    @Test
    public void test1() {
        Person person = new Person("curry", 30);
        PersonEntity entity = ContextMapper.MAPPER.toPersonEntity(person, Locale.JAPAN);

        assertThat(entity.getName()).isEqualTo("CURRY");
        assertThat(entity.getAge()).isEqualTo(30);
    }

    @Test
    public void test2() {
        Person person = new Person("curry", 30);
        PersonEntity entity = ContextMapper.MAPPER.toPersonEntity(person);

        assertThat(entity.getName()).isEqualTo("curry");
        assertThat(entity.getAge()).isEqualTo(30);
    }
}
