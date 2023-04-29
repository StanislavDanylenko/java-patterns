package stanislav.danylenko.patterns.behavior.iterator.custom;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavior.iterator.custom.impl.IterableEntityImpl;

class CustomIteratorTest {

    private static final String VALUE_1 = "Hello";
    private static final String VALUE_2 = "World";

    @Test
    void testIteratorCorrectUsage() {
        IterableEntityImpl iterableEntity = new IterableEntityImpl();
        iterableEntity.addValue(VALUE_1);
        iterableEntity.addValue(VALUE_2);
        CustomIterator iterator = iterableEntity.createIterator();

        assertThat(iterator.hasMore()).isTrue();
        assertThat(iterator.getNext()).isEqualTo(VALUE_1);
        assertThat(iterator.hasMore()).isTrue();
        assertThat(iterator.getNext()).isEqualTo(VALUE_2);
        assertThat(iterator.hasMore()).isFalse();
    }

    @Test
    void testIteratorHasMoreWithoutNext() {
        IterableEntityImpl iterableEntity = new IterableEntityImpl();
        iterableEntity.addValue(VALUE_1);
        iterableEntity.addValue(VALUE_2);
        CustomIterator iterator = iterableEntity.createIterator();

        assertThat(iterator.hasMore()).isTrue();
        assertThat(iterator.hasMore()).isTrue();
        assertThat(iterator.hasMore()).isTrue();
        assertThat(iterator.hasMore()).isTrue();
    }

    @Test
    void testIteratorNextWithoutHasMore() {
        IterableEntityImpl iterableEntity = new IterableEntityImpl();
        iterableEntity.addValue(VALUE_1);
        iterableEntity.addValue(VALUE_2);
        CustomIterator iterator = iterableEntity.createIterator();

        assertThat(iterator.getNext()).isEqualTo(VALUE_1);
        assertThat(iterator.getNext()).isEqualTo(VALUE_2);
        assertThatThrownBy(iterator::getNext)
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
}