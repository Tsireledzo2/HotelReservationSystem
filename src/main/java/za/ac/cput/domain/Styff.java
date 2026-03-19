package za.ac.cput.domain;

public class Styff {
    private String id;
    private String name;
    private String email;
    private String phone;

    public Styff() {
    }

    public Styff(Styff.Builder builder) {
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

    public void buy(){
        System.out.println("sdjsasda");;
    }

    public static class Builder{
        private String id;
        private String name;
        private String email;
        private String phone;

        public Styff.Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Styff.Builder setName(String name){
            this.name = name;
            return this;
        }
        public Styff.Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Styff.Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Styff.Builder copy(Styff customer){
            this.id = customer.id;
            this.name = customer.name;
            this.email = customer.email;
            this.phone = customer.phone;
            return this;
        }
        public Styff build(){
            return new Styff(this);
        }
    }
}
