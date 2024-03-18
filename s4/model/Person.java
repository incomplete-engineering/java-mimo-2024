package s4.model;

public class Person implements HavingName {
    private String firstName;
    private String lastName;
    private String title;

    private String infos;
    private String country;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getInfos() {
        return infos;
    }
    public void setInfos(String infos) {
        this.infos = infos;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String name() {
        return title + " " + firstName + "  " + lastName;
    }

    

}
