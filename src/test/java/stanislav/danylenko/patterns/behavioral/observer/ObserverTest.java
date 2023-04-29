package stanislav.danylenko.patterns.behavioral.observer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavioral.observer.impl.Bank;
import stanislav.danylenko.patterns.behavioral.observer.impl.CurrencyMessageImpl;
import stanislav.danylenko.patterns.behavioral.observer.impl.CurrencyProvider;

class ObserverTest {

    private static final Offset<Double> DOUBLE_OFFSET = within(0.001);

    @Test
    void testObserver() {
        Observer observer1 = new Bank();
        Observer observer2 = new Bank();

        Observable observable = new CurrencyProvider();
        observable.registerObserver(observer1);
        observable.registerObserver(observer2);

        assertThat(((Bank)observer1).getUsd()).isZero();
        assertThat(((Bank)observer1).getEur()).isZero();
        assertThat(((Bank)observer2).getUsd()).isZero();
        assertThat(((Bank)observer2).getEur()).isZero();

        double usd = 1.0;
        double eur = 2.0;
        CurrencyMessage message = new CurrencyMessageImpl(usd, eur);
        observable.notifyObservers(message);

        assertThat(((Bank)observer1).getUsd()).isCloseTo(usd, DOUBLE_OFFSET);
        assertThat(((Bank)observer1).getEur()).isCloseTo(eur, DOUBLE_OFFSET);
        assertThat(((Bank)observer2).getUsd()).isCloseTo(usd, DOUBLE_OFFSET);
        assertThat(((Bank)observer2).getEur()).isCloseTo(eur, DOUBLE_OFFSET);
    }

}