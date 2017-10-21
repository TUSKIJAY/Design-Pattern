package Cha08.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like lemon with your tea(y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
