package enum_mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SizeMapper {
    SizeMapper MAPPER = Mappers.getMapper(SizeMapper.class);

    @ValueMapping(source = "SMALL", target = "SHORT")
    @ValueMapping(source = "MEDIUM", target = "TALL")
    @ValueMapping(source = "LARGE", target = "GRANDE")
    SBSize toSBSize(Size size);

    @ValueMapping(source = "VENTI", target = MappingConstants.NULL)
    @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "LARGE")
    Size toSize(SBSize sbSize);
}
