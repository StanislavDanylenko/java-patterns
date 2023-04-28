package stanislav.danylenko.patterns.creational.factory.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.creational.factory.simple.components.SimpleRepository;

class SimpleFactoryTest {

    private static final String JDBC = "Jdbc";
    private static final String HIBERNATE = "Hibernate";
    private static final String TYPE = "Type = ";

    @Test
    void testRepositoryCreation() {
        SimpleRepository jdbcRepository = RepositoryFactory.createRepository(JDBC);
        SimpleRepository hibernateRepository = RepositoryFactory.createRepository(HIBERNATE);

        assertThat(jdbcRepository).isNotNull();
        assertThat(hibernateRepository).isNotNull();

        String jdbcLoad = jdbcRepository.load();
        assertThat(jdbcLoad).isEqualTo(TYPE + JDBC);

        String hibernateLoad = hibernateRepository.load();
        assertThat(hibernateLoad).isEqualTo(TYPE + HIBERNATE);

        SimpleRepository jdbcRepository2 = RepositoryFactory.createRepository(JDBC);
        SimpleRepository hibernateRepository2 = RepositoryFactory.createRepository(HIBERNATE);

        assertThat(jdbcRepository).isNotSameAs(jdbcRepository2);
        assertThat(hibernateRepository).isNotSameAs(hibernateRepository2);
    }

}