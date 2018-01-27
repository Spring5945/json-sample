package com.ctrip.igt;

import java.math.BigDecimal;

public class Student {
    private String name;
    private int age;
    private double salary;
    private BigDecimal money;
    private Father father;

    private Student(Builder builder) {
        name = builder.name;
        age = builder.age;
        salary = builder.salary;
        money = builder.money;
        father = builder.father;
    }

    public static final class Builder {
        private String name;
        private int age;
        private double salary;
        private BigDecimal money;
        private Father father;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder salary(double val) {
            salary = val;
            return this;
        }

        public Builder money(BigDecimal val) {
            money = val;
            return this;
        }

        public Builder father(Father val) {
            father = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
