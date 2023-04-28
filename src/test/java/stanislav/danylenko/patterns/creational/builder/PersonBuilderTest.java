package stanislav.danylenko.patterns.creational.builder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Date;

class PersonBuilderTest {

    @Test
    void setAllFieldsTest() {
        int age = 5;
        String name = "Stanislav";
        Date date = new Date(123456789);

        Person person = Person.builder()
                              .withAge(age)
                              .withName(name)
                              .withRegistrationDate(date)
                              .build();

        assertThat(person).isNotNull();
        assertThat(person.getAge()).isEqualTo(age);
        assertThat(person.getName()).isEqualTo(name);
        assertThat(person.getRegistrationDate()).isEqualTo(date);
    }

    @Test
    void doNotSetAnyFieldsTest() {
        Person person = Person.builder()
                              .build();

        assertThat(person).isNotNull();
        assertThat(person.getAge()).isNull();
        assertThat(person.getName()).isNull();
        assertThat(person.getRegistrationDate()).isNull();
    }

    @Test
    void setSeveralFieldsTest() {
        String name = "Stanislav";

        Person person = Person.builder()
                              .withName(name)
                              .build();

        assertThat(person).isNotNull();
        assertThat(person.getName()).isEqualTo(name);
        assertThat(person.getAge()).isNull();
        assertThat(person.getRegistrationDate()).isNull();
    }

}