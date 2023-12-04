package web.model;

import java.util.Objects;

//@Entity
//@Table(name = "Users")
public class User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @Column(name = "name")
    private String name;

//    @Column(name = "lastName")
    private String lastName;

//    @Column(name = "yearOfBirth")
    private int yearOfBirth;

    public User() {
    }

    public User(String name, String lastName, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }


    public User(int id, String name, String lastName, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && yearOfBirth == user.yearOfBirth && Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, yearOfBirth);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
