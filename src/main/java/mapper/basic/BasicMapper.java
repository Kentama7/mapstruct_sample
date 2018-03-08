package mapper.basic;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import dto.Address;
import dto.Person;
import dto.Student;
import entity.PersonEntity;

@Mapper
public interface BasicMapper {
    BasicMapper MAPPER = Mappers.getMapper(BasicMapper.class);

    Person toPerson(PersonEntity entity);

    List<Person> toPersons(List<PersonEntity> entities);

    @Mapping(target = "name", ignore = true)
    PersonEntity toPersonEntity(Person entity);

    @Mapping(source = "person.name", target = "name")
    @Mapping(source = "person.age", target = "age")
    @Mapping(source = "address.address", target = "address")
    Student personAndAddressToStudent(Person person, Address address);

    void updateStudent(Person person, @MappingTarget Student student);
}
