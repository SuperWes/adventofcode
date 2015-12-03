package com.superwes;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            DrunkElfPathThingy drunkElfPathThingy = new DrunkElfPathThingy();
            System.out.println(drunkElfPathThingy.countVisits(args[0]));
        }
    }
}
