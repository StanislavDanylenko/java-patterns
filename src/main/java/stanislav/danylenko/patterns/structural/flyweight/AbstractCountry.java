package stanislav.danylenko.patterns.structural.flyweight;

import lombok.Getter;

@Getter
public abstract class AbstractCountry {

    private final String name;

    protected AbstractCountry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract CountryLocale getLocale();

}
