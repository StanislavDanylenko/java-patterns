package stanislav.danylenko.patterns.structural.flyweight;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.structural.flyweight.impl.Poland;
import stanislav.danylenko.patterns.structural.flyweight.impl.Ukraine;

class FlyweightTest {

    private final CountryFactory factory = new CountryFactory();

    @Test
    void testInstancesIsTheSame() {
        AbstractCountry ukraine1 = factory.createCountry(CountryLocale.UA, "Ukraine");
        AbstractCountry poland1 = factory.createCountry(CountryLocale.PL, "Poland");

        AbstractCountry ukraine2 = factory.createCountry(CountryLocale.UA, "Ukraine updated");
        AbstractCountry poland2 = factory.createCountry(CountryLocale.PL, "Poland updated");

        assertThat(ukraine1).isSameAs(ukraine2);
        assertThat(poland1).isSameAs(poland2);

        assertThat(ukraine1).isInstanceOf(Ukraine.class);
        assertThat(poland1).isInstanceOf(Poland.class);

        assertThat(ukraine1.getName()).isEqualTo("Ukraine");
        assertThat(ukraine1.getLocale()).isEqualTo(CountryLocale.UA);
        assertThat(poland1.getName()).isEqualTo("Poland");
        assertThat(poland1.getLocale()).isEqualTo(CountryLocale.PL);
    }

}