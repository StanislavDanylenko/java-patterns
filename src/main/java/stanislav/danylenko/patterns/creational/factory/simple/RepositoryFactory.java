package stanislav.danylenko.patterns.creational.factory.simple;

import stanislav.danylenko.patterns.creational.factory.simple.components.SimpleRepository;
import stanislav.danylenko.patterns.creational.factory.simple.components.impl.SimpleRepositoryHibernateImpl;
import stanislav.danylenko.patterns.creational.factory.simple.components.impl.SimpleRepositoryJdbcImpl;

public final class RepositoryFactory {

    private static final String JDBC = "Jdbc";

    private RepositoryFactory() {}

    public static SimpleRepository createRepository(String type) {
        if (JDBC.equals(type)) {
            return new SimpleRepositoryJdbcImpl(type);
        } else {
            return new SimpleRepositoryHibernateImpl(type);
        }
    }

}
