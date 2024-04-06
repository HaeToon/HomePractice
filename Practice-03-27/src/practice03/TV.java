package practice03;

public class TV {
    private String brand;
    private int year,size;

    public TV(String brand, int year, int size) {
        this.brand = brand;
        this.year = year;
        this.size = size;
    }
    void show(){
        System.out.println(brand+"에서만든"+year+"년형"+size+"인치TV");
    }
}
