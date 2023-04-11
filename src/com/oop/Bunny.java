package com.oop;

public class Bunny {
    static interface Rabbit { }
    static class FlemishRabbit implements Rabbit { }

    private void hop(Rabbit r) {
        System.out.print("hop");
    }
    private void hop(FlemishRabbit r) {
        System.out.print("HOP");
    }
    public static void main(String[] args) {
        Bunny b = new Bunny();

        Rabbit r1 = new FlemishRabbit();
        FlemishRabbit r2 = new FlemishRabbit();
        b.hop(r1);
        b.hop(r2);
    }
}