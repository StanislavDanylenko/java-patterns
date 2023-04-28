package stanislav.danylenko.patterns.creational.builder;

import java.util.Date;

public final class Person {

    private final String name;
    private final Integer age;
    private final Date registrationDate;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.registrationDate = builder.registrationDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public static final class Builder {
        private String name;
        private Integer age;
        private Date registrationDate;

        private Builder() {}

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withRegistrationDate(Date date) {
            this.registrationDate = date;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
