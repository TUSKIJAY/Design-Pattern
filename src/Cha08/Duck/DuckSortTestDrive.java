package Cha08.Duck;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args){
        Duck[] ducks = {
                new Duck("Daffy",8),
                new Duck("Dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Donald",10),
                new Duck("Huey",2),
        };
        System.out.println("Before sorting:");
        for (Duck d:ducks){//for each循环
            System.out.println(d);
        }
        Arrays.sort(ducks);
        System.out.println("\nAfter sorting:");
        for (Duck d:ducks){
            System.out.println(d);
        }
    }
}
