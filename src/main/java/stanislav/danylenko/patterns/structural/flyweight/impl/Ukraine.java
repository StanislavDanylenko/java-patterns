package stanislav.danylenko.patterns.structural.flyweight.impl;

import stanislav.danylenko.patterns.structural.flyweight.AbstractCountry;
import stanislav.danylenko.patterns.structural.flyweight.CountryLocale;

public class Ukraine extends AbstractCountry {

    public Ukraine(String name) {
        super(name);
    }

    @Override
    public CountryLocale getLocale() {
        return CountryLocale.UA;
    }
}
