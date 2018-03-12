package invoke_other_mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import invoke_other_mapper.dto.Person;
import invoke_other_mapper.entity.PersonEntity;

@Mapper(uses = DateMapper.class)
public interface PersonMapper {
    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    Person toPerson(PersonEntity entity);

    PersonEntity toPersonEnity(Person dto);
}
