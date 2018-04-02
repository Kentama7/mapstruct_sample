package decorator;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dto.Person;
import entity.PersonEntity;

@Mapper
@DecoratedWith(PersonMapperDecorator.class)
public interface PersonMapper {

    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    Person toPerson(PersonEntity entity);
}
