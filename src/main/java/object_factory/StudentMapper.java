package object_factory;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dto.Student;
import entity.StudentEntity;

@Mapper(uses = StudentFactory.class)
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "address", ignore = true)
    Student toStudent(StudentEntity entity);
}
