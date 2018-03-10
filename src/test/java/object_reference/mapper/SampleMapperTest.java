package object_reference.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import object_reference.dto.Student;
import object_reference.entity.PersonEntity;
import object_reference.entity.StudentEntity;

public class SampleMapperTest {

    @Test
    public void test() {
        PersonEntity personEntity = new PersonEntity("マイケル");
        StudentEntity entity = new StudentEntity(personEntity);
        Student student = SampleMapper.MAPPER.toStudent(entity);

        assertThat(student.getPerson().getName()).isEqualTo("マイケル");
    }

}
