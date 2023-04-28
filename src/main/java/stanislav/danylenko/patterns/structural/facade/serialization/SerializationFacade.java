package stanislav.danylenko.patterns.structural.facade.serialization;

import stanislav.danylenko.patterns.structural.facade.serialization.components.JsonDeserializer;
import stanislav.danylenko.patterns.structural.facade.serialization.components.ToXmlSerializer;

public class SerializationFacade {

    private final JsonDeserializer jsonSerializer;
    private final ToXmlSerializer xmlSerializer;

    public SerializationFacade(JsonDeserializer jsonSerializer, ToXmlSerializer xmlSerializer) {
        this.jsonSerializer = jsonSerializer;
        this.xmlSerializer = xmlSerializer;
    }

    public <T> T fromJson(String value, Class<T> clazz) {
        if (clazz == Integer.class) {
            return (T) jsonSerializer.deserializeToInt(value);
        } else if (clazz == Double.class) {
            return (T) jsonSerializer.deserializeToDouble(value);
        } else if (clazz == Long.class) {
            return (T) jsonSerializer.deserializeToLong(value);
        } else {
            throw new RuntimeException("Unknown type");
        }
    }

    public <T> T fromXml(String value, Class<T> clazz) {
        if (clazz == Integer.class) {
            return (T) xmlSerializer.deserializeToInt(value);
        } else if (clazz == Double.class) {
            return (T) xmlSerializer.deserializeToDouble(value);
        } else if (clazz == Long.class) {
            return (T) xmlSerializer.deserializeToLong(value);
        } else {
            throw new RuntimeException("Unknown type");
        }
    }

}
