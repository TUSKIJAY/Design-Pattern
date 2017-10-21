package Cha04;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();
    public Test(){
        arrayList.add("fuck c");
        linkedList.add("fuck c++");
    }
    public void output(){
        System.out.println(arrayList.get(0));
        System.out.println(linkedList.get(0));
    }
    public static void main(String[] args){
        Test test = new Test();
        test.output();
    }
}
