package stanislav.danylenko.patterns.structural.composite;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.structural.composite.impl.Area;
import stanislav.danylenko.patterns.structural.composite.impl.CompositeArea;
import stanislav.danylenko.patterns.structural.composite.impl.Person;

class CompositeTest {

    @Test
    void testComposite() {
        Area area1 = new Area();
        area1.addPerson(new Person("id1"));
        area1.addPerson(new Person("id2"));

        Area area2 = new Area();
        area2.addPerson(new Person("id3"));

        CompositeArea compositeArea1 = new CompositeArea();
        compositeArea1.addTerritoryUnit(area1);
        compositeArea1.addTerritoryUnit(area2);

        Area area3 = new Area();
        area3.addPerson(new Person("id4"));

        CompositeArea compositeArea2 = new CompositeArea();
        compositeArea2.addTerritoryUnit(compositeArea1);
        compositeArea2.addTerritoryUnit(area3);

        int expectedCountOfPeople = 4;
        int countOfPeople = compositeArea2.getCountOfPeople();
        assertThat(countOfPeople).isEqualTo(expectedCountOfPeople);
    }

}