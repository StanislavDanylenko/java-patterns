package stanislav.danylenko.patterns.structural.composite.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.patterns.structural.composite.TerritoryUnit;

public class CompositeArea implements TerritoryUnit {

    private final List<TerritoryUnit> territoryUnits = new ArrayList<>();

    public void addTerritoryUnit(TerritoryUnit area) {
        territoryUnits.add(area);
    }

    public void removeTerritoryUnit(TerritoryUnit area) {
        territoryUnits.remove(area);
    }

    @Override
    public int getCountOfPeople() {
        return territoryUnits.stream().mapToInt(TerritoryUnit::getCountOfPeople).sum();
    }

}
