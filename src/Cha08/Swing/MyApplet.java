package Cha08.Swing;

import java.applet.Applet;
import java.awt.*;

/**
 * applet是一个能在网页上执行的小程序，Applet类中提供了好些钩子。
 * 具体的applet大量使用钩子来提供行为。因为这些行为是作为钩子实现的，所以applet类就不用去实现它们。
 */
public class MyApplet extends Applet {
    String message;

    /**
     * init钩子用来进行applet的初始化动作，它会在applet一开始的时候被调用一次
     */
    public void init(){
        message = "Hello World,I'm alive!";
        repaint();//repaint()是Applet类的一个具体方法，可让applet的上层组件知道这个applet需要重绘
    }

    /**
     * 这个start()钩子可以在applet正要被显示到网页上时，让applet做一些动作
     * （下面都是钩子）
     */
    public void start(){
        message = "Now I'm starting up...";
    }
    public void stop(){
        message = "Oh,now I'm being stopped...";
    }
    public void destroy(){}
    public void paint(Graphics g){
        g.drawString(message,5,15);
    }
}
