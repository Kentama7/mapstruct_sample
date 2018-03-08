package mapper.basic;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dto.Person;
import entity.PersonEntity;

@Mapper
public interface CustomMethodMapper {
    CustomMethodMapper MAPPER = Mappers.getMapper(CustomMethodMapper.class);

    default Person toPerson(PersonEntity entity) {
        Person dto = new Person();
        dto.setName(entity.getName() + "!!");
        dto.setAge(entity.getAge() + 100);
        return dto;
    }
}
