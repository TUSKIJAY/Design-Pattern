package Cha08.Duck;

import org.jetbrains.annotations.NotNull;

public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name,int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weight " + weight;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        Duck otherDuck = (Duck)o;
        if (this.weight < otherDuck.weight){
            return  -1;
        }else if (this.weight == otherDuck.weight){
            return 0;
        }else {//this.weight > otherDuck.weight
            return 1;
        }
    }
}
