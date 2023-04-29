package stanislav.danylenko.patterns.behavior.iterator.javaimpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;


class ReverseOrderIteratorTest {

    private static final String VALUE_1 = "Hello";
    private static final String VALUE_2 = "World";

    @Test
    void testIteratorGetCorrectUsage() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(VALUE_2);
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(VALUE_1);
        assertThat(iterator.hasNext()).isFalse();
    }

    @Test
    void testIteratorHasMoreWithoutNext() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.hasNext()).isTrue();
    }

    @Test
    void testIteratorNextWithoutHasMore() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        assertThat(iterator.next()).isEqualTo(VALUE_2);
        assertThat(iterator.next()).isEqualTo(VALUE_1);
        assertThatThrownBy(iterator::next)
                .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void testIteratorSuccessRemove() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        assertThat(iterator.hasNext()).isEqualTo(true);
        assertThat(iterator.next()).isEqualTo(VALUE_2);
        iterator.remove();

        int expectedSize = 1;
        assertThat(list.size()).isEqualTo(expectedSize);
    }

    @Test
    void testIteratorSuccessRemoveAll() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        assertThat(iterator.hasNext()).isEqualTo(true);
        assertThat(iterator.next()).isEqualTo(VALUE_2);
        iterator.remove();
        assertThat(iterator.hasNext()).isEqualTo(true);
        assertThat(iterator.next()).isEqualTo(VALUE_1);
        iterator.remove();
        assertThat(iterator.hasNext()).isEqualTo(false);
    }

    @Test
    void testIteratorRemoveWhenHasNextFalse() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        assertThat(iterator.hasNext()).isEqualTo(true);
        assertThat(iterator.next()).isEqualTo(VALUE_2);
        iterator.remove();
        assertThat(iterator.hasNext()).isEqualTo(true);
        assertThat(iterator.next()).isEqualTo(VALUE_1);
        iterator.remove();
        assertThat(iterator.hasNext()).isEqualTo(false);
        assertThatThrownBy(iterator::remove)
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void testIteratorRemoveWhenNextWasNotCalled() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        assertThatThrownBy(iterator::remove)
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void testIteratorRemoveWhenAlreadyDeleted() {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add(VALUE_1);
        list.add(VALUE_2);
        Iterator<String> iterator = list.iterator();

        String next = iterator.next();
        iterator.remove();
        assertThatThrownBy(iterator::remove)
                .isInstanceOf(IllegalStateException.class);
    }
}