package default_constants;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dto.Student;
import entity.StudentEntity;

public class DefaultConstantsMapperTest {

    @Test
    public void test() {
        StudentEntity entity = new StudentEntity();

        Student student = DefaultConstantsMapper.MAPPER.toStudent(entity);

        assertThat(student.getName()).isEqualTo("zagas");
        assertThat(student.getAddress()).isEqualTo("SPOKEN");
    }

}
