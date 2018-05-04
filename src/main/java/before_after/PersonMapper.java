package before_after;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import dto.Person;
import entity.PersonEntity;

@Mapper
public abstract class PersonMapper {

    @BeforeMapping
    protected void before(PersonEntity entity) {
        entity.setName("BEFORE_" + entity.getName());
    }

    @AfterMapping
    protected void after(@MappingTarget Person person) {
        person.setName(person.getName() + "_AFTER");
    }

    public abstract Person toPerson(PersonEntity entity);
}
