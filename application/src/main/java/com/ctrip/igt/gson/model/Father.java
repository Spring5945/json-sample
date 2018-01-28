package com.ctrip.igt.gson.model;

public class Father {
    private String name;
    private int age;
    private Company company;

    private Father(Builder builder) {
        name = builder.name;
        age = builder.age;
        company = builder.company;
    }

    public static final class Builder {
        private String name;
        private int age;
        private Company company;

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

        public Builder company(Company val) {
            company = val;
            return this;
        }

        public Father build() {
            return new Father(this);
        }
    }
}
