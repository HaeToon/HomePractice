package practice06;

import java.util.*;

public class Location {
   private String city;
   private double x,y;

    public Location(String city, double x, double y) {
        this.city = city;
        this.x = x;
        this.y = y;
    }

    public String getCity() {
        return city;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
