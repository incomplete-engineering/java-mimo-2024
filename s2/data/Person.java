package s2.data;

public class Person {

    private String title = "Dr.";
    private String firstName;
    private String lastName;
    private int age; 

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return title + " " + lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return title + " " + firstName + " " + lastName;
    }
    
}
