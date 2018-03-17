package qualifier;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dto.Student;
import entity.StudentEntity;

public class QualifierMapperTest {

    @Test
    public void test() {
        StudentEntity entity = new StudentEntity("curry", 30, "gsw");

        Student student = QualifierMapper.MAPPER.toStudent(entity);

        assertThat(student.getName()).isEqualTo("CURRY");
        assertThat(student.getAddress()).isEqualTo("gsw");
        assertThat(student.getAge()).isEqualTo(30);
    }

}
