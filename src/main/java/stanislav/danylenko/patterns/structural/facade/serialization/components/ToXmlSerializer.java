package stanislav.danylenko.patterns.structural.facade.serialization.components;

// just for example
public class ToXmlSerializer {

    public Integer deserializeToInt(String value) {
        return Integer.parseInt(value);
    }

    public Double deserializeToDouble(String value) {
        return Double.parseDouble(value);
    }

    public Long deserializeToLong(String value) {
        return Long.parseLong(value);
    }

}
