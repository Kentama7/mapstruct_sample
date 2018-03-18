package default_constants;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dto.Student;
import entity.StudentEntity;

@Mapper
public interface DefaultConstantsMapper {
    DefaultConstantsMapper MAPPER = Mappers.getMapper(DefaultConstantsMapper.class);

    @Mapping(target = "name", defaultValue = "zagas")
    @Mapping(target = "address", constant = "SPOKEN")
    Student toStudent(StudentEntity entity);

}
