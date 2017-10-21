package Cha08.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffe extends CaffeineBeverageWithHook{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * 根据用户输入返回true或者false
     * @return
     */
    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 通过命令行获取客人的输入
     * @return
     */
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee(y/n)?");

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
