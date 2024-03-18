package s3.data;

public class Author {

    private String name;
    private String country;
    private int yearOfBirth;


    //_____ né.e à ____ en ____
    //_____ né.e à ____

    public Author(String name, String country, int yearOfBirth) {
        this.name = name;
        this.country = country;
        this.yearOfBirth = yearOfBirth;
    }

    public Author(String name, String country) {
        this.name = name;
        this.country = country;
        this.yearOfBirth = 2999;
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
