package object_reference.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import object_reference.dto.Person;
import object_reference.dto.Student;
import object_reference.entity.PersonEntity;
import object_reference.entity.StudentEntity;

@Mapper
public interface SampleMapper {
    SampleMapper MAPPER = Mappers.getMapper(SampleMapper.class);

    Student toStudent(StudentEntity entity);

    Person toPerson(PersonEntity entity);
}
