package practice06;

public class Country {
   private String country;
    private int people;

    public Country(String country, int people) {
        this.country = country;
        this.people = people;
    }

    public Country() {
    }

    public String getCountry() {
        return country;
    }

    public int getPeople() {
        return people;
    }
}
