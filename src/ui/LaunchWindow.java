package ui;

import algorithm.*;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class LaunchWindow extends JFrame{
    
    private final WelcomeWindow welcomeWindow = new WelcomeWindow(this);
    private final Fcfs fcfs = new Fcfs(this);
    private final Sjn sjn = new Sjn(this);
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
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void showWindow(String cardName){
        cardLayout.show(getContentPane(), cardName);
    }

    public static void main(String[] args) { new LaunchWindow(); }
}
