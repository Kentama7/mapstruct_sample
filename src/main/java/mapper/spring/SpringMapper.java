package mapper.spring;

import org.mapstruct.Mapper;

import dto.Person;
import entity.PersonEntity;

@Mapper(config = SpringConfig.class)
public interface SpringMapper {

    Person toPerson(PersonEntity entity);
}
