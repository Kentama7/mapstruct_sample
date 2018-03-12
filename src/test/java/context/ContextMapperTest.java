package context;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Locale;

import org.junit.Test;

import dto.Person;
import entity.PersonEntity;

public class ContextMapperTest {

    @Test
    public void test1() {
        Person person = new Person("マイケル", 23);
        PersonEntity entity = ContextMapper.MAPPER.toPersonEntity(person, Locale.JAPAN);

        assertThat(entity.getName()).isEqualTo("日本語");
        assertThat(entity.getAge()).isEqualTo(23);
    }

    @Test
    public void test2() {
        Person person = new Person("マイケル", 23);
        PersonEntity entity = ContextMapper.MAPPER.toPersonEntity(person);

        assertThat(entity.getName()).isEqualTo("マイケル");
        assertThat(entity.getAge()).isEqualTo(23);
    }
}
