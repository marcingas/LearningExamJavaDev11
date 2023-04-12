package com.oop;

enum Direction { north, south, east, west; };
public class Ship {
    public static void main(String[] compass) {
        System.out.print(Direction.valueOf(compass[0]));
    }
}