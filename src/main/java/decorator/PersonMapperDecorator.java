package decorator;

import dto.Person;
import entity.PersonEntity;

public abstract class PersonMapperDecorator implements PersonMapper {

    private final PersonMapper delegate;

    public PersonMapperDecorator(PersonMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public Person toPerson(PersonEntity entity) {
        Person dto = delegate.toPerson(entity);
        dto.setName(dto.getName().toUpperCase());
        return dto;
    }
}
