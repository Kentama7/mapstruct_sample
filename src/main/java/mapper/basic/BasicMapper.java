package mapper.basic;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dto.Person;
import entity.PersonEntity;

@Mapper
public interface BasicMapper {
    BasicMapper MAPPER = Mappers.getMapper(BasicMapper.class);

    Person toPerson(PersonEntity entity);

    List<Person> toPersons(List<PersonEntity> entities);

    @Mapping(target = "name", ignore = true)
    PersonEntity toPersonEntity(Person entity);
}
