import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName , String lastName , int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public void setAge(int age) {
        if(age<0) return;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void print(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }


}
