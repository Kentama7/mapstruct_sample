package context;

import java.util.Locale;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dto.Person;
import entity.PersonEntity;

@Mapper
public interface ContextMapper {

    ContextMapper MAPPER = Mappers.getMapper(ContextMapper.class);

    PersonEntity toPersonEntity(Person person);

    PersonEntity toPersonEntity(Person person, @Context Locale locale);

    default String translate(String name, @Context Locale locale) {
        return Locale.JAPAN.equals(locale) ? "日本語" : "ENGLISH";
    }
}
