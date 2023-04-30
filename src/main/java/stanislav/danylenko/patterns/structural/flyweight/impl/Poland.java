package stanislav.danylenko.patterns.structural.flyweight.impl;

import stanislav.danylenko.patterns.structural.flyweight.AbstractCountry;
import stanislav.danylenko.patterns.structural.flyweight.CountryLocale;

public class Poland extends AbstractCountry {

    public Poland(String name) {
        super(name);
    }


    @Override
    public CountryLocale getLocale() {
        return CountryLocale.PL;
    }

}
