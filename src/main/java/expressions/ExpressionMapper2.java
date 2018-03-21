package expressions;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.util.StringUtils;

import dto.Student;
import entity.StudentEntity;

@Mapper(imports = StringUtils.class)
public interface ExpressionMapper2 {

    @Mapping(target = "name", expression = "java(StringUtils.capitalize(entity.getName()))")
    Student toStudent(StudentEntity entity);
}
