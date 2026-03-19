package za.ac.cput.domain;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String phone;

    public Customer() {
    }

    public Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String name;
        private String email;
        private String phone;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder copy(Customer customer){
            this.id = customer.id;
            this.name = customer.name;
            this.email = customer.email;
            this.phone = customer.phone;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
