package practice03;

public class Song {
    private String title,artist,country;
    private int year;

    public Song(String title, String artist, String country, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }
    void show(){
        System.out.println(year+"년"+country+"출신의 가수"+artist+"가 부른"+title);
    }
}
