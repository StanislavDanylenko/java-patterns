package stanislav.danylenko.patterns.behavior.observer.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.patterns.behavior.observer.CurrencyMessage;
import stanislav.danylenko.patterns.behavior.observer.Observer;

@Slf4j
public class Bank implements Observer {

    private double usd;
    private double eur;

    @Override
    public void update(CurrencyMessage message) {
        usd = message.getUsd();
        eur = message.getEur();
        log.info("Currency was updated - use:{}, eur:{}", usd, eur);
    }

    public double getUsd() {
        return usd;
    }

    public double getEur() {
        return eur;
    }
}
