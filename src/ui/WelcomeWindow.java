package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static ui.UIConstants.*;

public class WelcomeWindow extends JPanel{
    
    private final JLabel label = new JLabel();
    
    public WelcomeWindow(LaunchWindow launchWindow){
        label.setText("Hello World");
        label.setForeground(new Color(44, 110, 73));
        label.setFont(new Font("JetBrains Mono", Font.BOLD, 100));
        
        add(label);
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setBackground(new Color(237, 237, 237));
        
        addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e){
               launchWindow.showWindow("fcfs");
           }
        });   
    }
}
