package expressions;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dto.Student;
import entity.StudentEntity;

@Mapper
public interface ExpressionMapper {
    ExpressionMapper MAPPER = Mappers.getMapper(ExpressionMapper.class);

    @Mapping(target = "name", expression = "java(org.springframework.util.StringUtils.capitalize(entity.getName()))")
    Student toStudent(StudentEntity entity);
}
