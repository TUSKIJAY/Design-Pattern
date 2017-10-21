package Cha02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingObserverExample{
    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go(){
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DeviListener());
        frame.getContentPane().add(BorderLayout.CENTER,button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Don't do it,you might regret it!");
        }
    }
    class DeviListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Come on,do it!");
        }
    }
}
