public class Song {
    int year;
    String country;
    String artist;
    String title;

    Song(int year , String country,String artist,String title){
        this.year=year;
        this.country=country;
        this.artist=artist;
        this.title=title;
    }
    void show(){
        System.out.println(year + "년, "+country + " 국적의 " + artist + "가 부른 "+ title);
    }
}
