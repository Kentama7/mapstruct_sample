package mapper.basic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import dto.Address;
import dto.Person;
import dto.Student;
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

    @Test
    public void severalSource() {
        Person person = new Person("マイケル", 23);
        Address address = new Address("ノースカロライナ州", "12345");
        Student student = BasicMapper.MAPPER.personAndAddressToStudent(person, address);
        assertThat(student.getName()).isEqualTo("マイケル");
        assertThat(student.getAge()).isEqualTo(23);
        assertThat(student.getAddress()).isEqualTo("ノースカロライナ州");
    }

    @Test
    public void update() {
        Person person = new Person("マイケル", 23);
        Student student = new Student("カリー", 30, "カリフォルニア州");
        BasicMapper.MAPPER.updateStudent(person, student);
        assertThat(student.getName()).isEqualTo("マイケル");
        assertThat(student.getAge()).isEqualTo(23);
        assertThat(student.getAddress()).isEqualTo("カリフォルニア州");
    }
}
