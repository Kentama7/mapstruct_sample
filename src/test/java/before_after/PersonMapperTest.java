package before_after;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import dto.Person;
import entity.PersonEntity;

public class PersonMapperTest {

    @Test
    public void test() {
        PersonEntity entity = new PersonEntity();
        entity.setName("curry");

        PersonMapper mapper = Mappers.getMapper(PersonMapper.class);
        Person person = mapper.toPerson(entity);

        assertThat(person.getName()).isEqualTo("BEFORE_curry_AFTER");
    }

}
