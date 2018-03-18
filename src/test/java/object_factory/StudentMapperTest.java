package object_factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dto.Student;
import entity.StudentEntity;

public class StudentMapperTest {

    @Test
    public void test() {
        StudentEntity entity = new StudentEntity();
        Student student = StudentMapper.MAPPER.toStudent(entity);
        assertThat(student.getAddress()).isEqualTo("STUDENT_FACTORY");
    }

}