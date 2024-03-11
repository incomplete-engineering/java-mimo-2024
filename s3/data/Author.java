package s3.data;

public class Author {

    private String name;
    private String country;
    private int yearOfBirth;


    

    public Author(String name, String country, int yearOfBirth) {
        this.name = name;
        this.country = country;
        this.yearOfBirth = yearOfBirth;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    
}
