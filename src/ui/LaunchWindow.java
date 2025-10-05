package ui;

import algorithm.*;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class LaunchWindow extends JFrame{
    
    private final WelcomeWindow welcomeWindow = new WelcomeWindow(this);
    private final Fcfs fcfs = new Fcfs(this);
    private final Sjn sjn = new Sjn(this);
    private final Rr rr = new Rr(this);
    private final CardLayout cardLayout = new CardLayout();
    private final ImageIcon cpu = new ImageIcon("src/assets/cpu.png");
    
    public LaunchWindow() {
        setIconImage(cpu.getImage());
        setTitle("CPU Scheduling Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(cardLayout);
        
        add(welcomeWindow, "welcomeWindow");
        add(fcfs, "fcfs");
        add(sjn, "sjn");
        add(rr, "rr");
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void showWindow(int num){
        switch(num) {
            case 0:
                cardLayout.show(getContentPane(),"fcfs"); break;
            case 1:
                cardLayout.show(getContentPane(),"sjn"); break;
            case 2:
                cardLayout.show(getContentPane(),"rr"); break;
            default: break;
        }
    }

    public static void main(String[] args) { new LaunchWindow(); }
}
