package stanislav.danylenko.patterns.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

import stanislav.danylenko.patterns.structural.flyweight.impl.Poland;
import stanislav.danylenko.patterns.structural.flyweight.impl.Ukraine;

public class CountryFactory {

    // can be static
    private final Map<CountryLocale, AbstractCountry> localCountryMap = new EnumMap<>(CountryLocale.class);

    public AbstractCountry createCountry(CountryLocale locale, String name) {
        return localCountryMap.computeIfAbsent(locale, newLocale -> switch (locale) {
            case PL -> new Poland(name);
            case UA -> new Ukraine(name);
        });
    }
}
