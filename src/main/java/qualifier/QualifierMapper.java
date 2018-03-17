package qualifier;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dto.Student;
import entity.StudentEntity;

@Mapper(uses = Characters.class)
public interface QualifierMapper {
    QualifierMapper MAPPER = Mappers.getMapper(QualifierMapper.class);

    @Mapping(target = "name", qualifiedBy = { CharacterConverter.class, ToUpper.class })
    Student toStudent(StudentEntity entity);
}
