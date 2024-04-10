package practice03;

public class Song {
    private int year;
    private String country,artist,title;
    Song(int year,String country, String artist,String title){
        this.year =year;
        this.artist=artist;
        this.country=country;
        this.title=title;
    }
    void show(){
        System.out.println(year+"년 "+country + "국적의 가수" + artist + "가부른 "+title);
    }


}
