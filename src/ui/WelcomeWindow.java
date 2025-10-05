package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static ui.UIConstants.*;

public class WelcomeWindow extends JPanel{
    
    private final JLabel title = new JLabel("<html>Scheduling Simulator</html>");
    private final String members[] = {
                                  "Mark Joshua Padilla",
                                  "Kryzza Dianne Quizon",
                                  "Miko James Santos",
                                  "Gerald Sullano"
    };
    JLabel[] membersLabel = new JLabel[members.length];
    
    public WelcomeWindow(LaunchWindow launchWindow){
        
        setLayout(new GridBagLayout());
        setBackground(new Color(145, 147, 148));
        title.setForeground(yourGreen);
        title.setFont(new Font("JetBrains Mono", Font.BOLD, 60));
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx=0; gbc.gridy=1;
        gbc.insets = new Insets(-150, 0, 50, 0);
        add(title, gbc);
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setMaximumSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        
        gbc.insets = new Insets(0, 0, 5, 0);
        for (int i = 0; i < members.length; i++) {
            gbc.gridx=0; gbc.gridy=2+i;
            add(membersLabel[i] = new JLabel(members[i]), gbc); 
            membersLabel[i].setFont(new Font("JetBrains Mono", Font.BOLD, 25));
        }
        
        
        addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e){
               launchWindow.showWindow(0);
           }
        });   
    }
}
