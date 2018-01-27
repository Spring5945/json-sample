package com.ctrip.igt;

public class Company {
    private String companyName;
    private String companyDetail;

    private Company(Builder builder) {
        companyName = builder.companyName;
        companyDetail = builder.companyDetail;
    }


    public static final class Builder {
        private String companyName;
        private String companyDetail;

        public Builder() {
        }

        public Builder companyName(String val) {
            companyName = val;
            return this;
        }

        public Builder companyDetail(String val) {
            companyDetail = val;
            return this;
        }

        public Company build() {
            return new Company(this);
        }
    }
}
