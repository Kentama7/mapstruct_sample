package enum_mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SizeMapperTest {

    @Test
    public void test1() {
        SBSize sbSize = SizeMapper.MAPPER.toSBSize(Size.SMALL);
        assertThat(sbSize).isEqualTo(SBSize.SHORT);
    }

    @Test
    public void test2() {
        SBSize sbSize = SizeMapper.MAPPER.toSBSize(Size.LARGE);
        assertThat(sbSize).isEqualTo(SBSize.GRANDE);
    }
}
