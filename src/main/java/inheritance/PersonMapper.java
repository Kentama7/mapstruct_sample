package inheritance;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "emailAddress", source = "email")
    Person toPerson(PersonEntity entity);

    @InheritConfiguration
    Person toPersonInherit(PersonEntity entity);

    @InheritInverseConfiguration(name = "toPerson")
    PersonEntity toPersonInverse(Person person);
}
