package mapper.basic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import dto.Person;
import entity.PersonEntity;

public class BasicMapperTest {

    @Test
    public void normal() {
        PersonEntity entity = new PersonEntity("マイケル", 23);
        Person person = BasicMapper.MAPPER.toPerson(entity);
        assertThat(person.getName()).isEqualTo("マイケル");
        assertThat(person.getAge()).isEqualTo(23);
    }

    @Test
    public void list() {
        List<PersonEntity> list = List.of(new PersonEntity("マイケル", 23), new PersonEntity("カリー", 30));
        List<Person> persons = BasicMapper.MAPPER.toPersons(list);

        List<Person> expected = List.of(new Person("マイケル", 23), new Person("カリー", 30));
        assertThat(persons).hasSize(2).containsExactlyElementsOf(expected);
    }

    @Test
    public void ignoreName() {
        Person dto = new Person("マイケル", 23);
        PersonEntity entity = BasicMapper.MAPPER.toPersonEntity(dto);
        assertThat(entity.getName()).isNull();
        assertThat(entity.getAge()).isEqualTo(23);
    }
}
