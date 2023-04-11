package com.oop;

class Cinema {
    private String name = "Sequel";
    public Cinema(){}

    public Cinema(String name) {
        this.name = name;
    }
}
public class Movie extends Cinema {
    private String name = "adaptation";
    public Movie(String movie) {
        this.name = movie;
    }
    public static void main(String[] showing) {
        System.out.print(new Movie("Trilogy").name);
    }
}