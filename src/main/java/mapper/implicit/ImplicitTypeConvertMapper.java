package mapper.implicit;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dto.ConvertDto;
import dto.Dto;

@Mapper
public interface ImplicitTypeConvertMapper {

    ImplicitTypeConvertMapper MAPPER = Mappers.getMapper(ImplicitTypeConvertMapper.class);

    ConvertDto toConvertDto(Dto dto);

    @Mapping(target = "intValue", numberFormat = "000")
    @Mapping(target = "localDateValue", dateFormat = "yyyy/MM/dd")
    ConvertDto format(Dto dto);

}
