package inheritance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PersonMapperTest {

    @Test
    public void test() {
        PersonEntity entity = new PersonEntity();
        entity.setEmail("hoge@example.com");

        Person person = PersonMapper.MAPPER.toPersonInherit(entity);

        assertThat(person.getEmailAddress()).isEqualTo("hoge@example.com");
    }

}
