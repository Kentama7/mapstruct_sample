package expressions;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dto.Student;
import entity.StudentEntity;

public class ExpressionMapperTest {

    @Test
    public void test() {
        StudentEntity entity = new StudentEntity();
        entity.setName("curry");

        Student student = ExpressionMapper.MAPPER.toStudent(entity);

        assertThat(student.getName()).isEqualTo("Curry");
    }

}
