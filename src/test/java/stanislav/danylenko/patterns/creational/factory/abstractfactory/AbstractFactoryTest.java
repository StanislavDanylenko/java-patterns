package stanislav.danylenko.patterns.creational.factory.abstractfactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;

class AbstractFactoryTest {

    private static final String PLAIN = "Plain";
    private static final String LUXURY = "Luxury";

    @Test
    void testGetPlainChairByFactory() {
        SimpleFurnitureFactory factory = FurnitureFactory.getFactory(PLAIN);
        Chair chair = factory.createChair();
        String chairText = chair.sitOn();

        assertThat(chairText).isEqualTo("Chair impl - " + PLAIN);
    }

    @Test
    void testGetPlainChair() {
        Chair chair = FurnitureFactory.getChair(PLAIN);
        String chairText = chair.sitOn();

        assertThat(chairText).isEqualTo("Chair impl - " + PLAIN);
    }

    @Test
    void testGetPlainTableByFactory() {
        SimpleFurnitureFactory factory = FurnitureFactory.getFactory(PLAIN);
        Table table = factory.createTable();
        String tableText = table.putOn();

        assertThat(tableText).isEqualTo("Table impl - " + PLAIN);
    }

    @Test
    void testGetPlainTable() {
        Table table = FurnitureFactory.getTable(PLAIN);
        String tableText = table.putOn();

        assertThat(tableText).isEqualTo("Table impl - " + PLAIN);
    }


    @Test
    void testGetLuxuryChairByFactory() {
        SimpleFurnitureFactory factory = FurnitureFactory.getFactory(LUXURY);
        Chair chair = factory.createChair();
        String chairText = chair.sitOn();

        assertThat(chairText).isEqualTo("Chair impl - " + LUXURY);
    }

    @Test
    void testGetLuxuryChair() {
        Chair chair = FurnitureFactory.getChair(LUXURY);
        String chairText = chair.sitOn();

        assertThat(chairText).isEqualTo("Chair impl - " + LUXURY);
    }

    @Test
    void testGetLuxuryTableByFactory() {
        SimpleFurnitureFactory factory = FurnitureFactory.getFactory(LUXURY);
        Table table = factory.createTable();
        String tableText = table.putOn();

        assertThat(tableText).isEqualTo("Table impl - " + LUXURY);
    }

    @Test
    void testGetLuxuryTable() {
        Table table = FurnitureFactory.getTable(LUXURY);
        String tableText = table.putOn();

        assertThat(tableText).isEqualTo("Table impl - " + LUXURY);
    }

}