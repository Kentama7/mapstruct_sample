package inheritance;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface PersonMapper2 {

    PersonMapper2 MAPPER = Mappers.getMapper(PersonMapper2.class);

    @Mapping(target = "emailAddress", source = "email")
    Person toPerson(PersonEntity entity);

    Person toPersonInherit(PersonEntity entity);
}
