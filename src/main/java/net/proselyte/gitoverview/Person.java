package net.proselyte.gitoverview;

public class Person extends BaseEntity{

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + super.getId() + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
