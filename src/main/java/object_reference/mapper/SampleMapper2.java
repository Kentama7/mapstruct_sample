package object_reference.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import object_reference.dto.Person;
import object_reference.dto.Student;
import object_reference.entity.PersonEntity;
import object_reference.entity.StudentEntity;

@Mapper(disableSubMappingMethodsGeneration = true)
public interface SampleMapper2 {
    SampleMapper2 MAPPER = Mappers.getMapper(SampleMapper2.class);

    Student toStudent(StudentEntity entity);

    Person toPerson(PersonEntity entity);
}
