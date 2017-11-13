package core1.ch06.innerClass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Created by MKD on 2017/11/5
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();
        //keep program running until user selects "ok"
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
class TalkingClock{
    private int interval;
    private boolean beep;
    //constructs a talking clock
    public TalkingClock(int interval,boolean beep){
        this.interval = interval;
        this.beep = beep;
    }
    //starts the clock
    public void start(){
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(interval,listener);
        t.start();
    }
    public class TimerPrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
