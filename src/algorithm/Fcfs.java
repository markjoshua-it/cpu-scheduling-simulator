package algorithm;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ui.LaunchWindow;
import static ui.UIConstants.*;

public class Fcfs extends JPanel{
    
    private final JLabel inputLabel = new JLabel("FCFS");
    private final JLabel algorithmLabel = new JLabel(LABEL_ALGORITHM);
    private final JComboBox algorithmChoicesBox = new JComboBox(ALGORITHM_CHOICES);
    private final JLabel arrivalTimeLabel = new JLabel(LABEL_ARRIVAL);
    private final JTextField arrivalTimeField = new JTextField();
    private final JLabel burstTimeLabel = new JLabel(LABEL_BURST);
    private final JTextField burstTimeField = new JTextField();
    private final GridBagLayout gridBagLayout = new GridBagLayout();
    private final GridBagConstraints gbc = new GridBagConstraints();
    
    public Fcfs(LaunchWindow launchWindow){
        algorithmChoicesBox.setSelectedIndex(0);
        setLayout(gridBagLayout);
        setPreferredSize(PANEL_SIZE);
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // INPUT
        gbc.gridx=0; gbc.gridy=0;
        gbc.gridwidth=5;
        gbc.anchor = GridBagConstraints.CENTER;
        inputLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 50));
        add(inputLabel, gbc);
        
        // ALGO
        gbc.gridx=0; gbc.gridy=1;
        add(algorithmLabel, gbc);
        
        gbc.gridx=1; gbc.gridy=2;
        algorithmChoicesBox.setMaximumSize(COMPONENT_SIZE);
        algorithmChoicesBox.setPreferredSize(COMPONENT_SIZE);
        add(algorithmChoicesBox, gbc);
        
        // AT
        gbc.gridx=0; gbc.gridy=3;
        add(arrivalTimeLabel, gbc);
        
        gbc.gridx=1; gbc.gridy=4;
        arrivalTimeField.setPreferredSize(COMPONENT_SIZE);
        arrivalTimeField.setMaximumSize(COMPONENT_SIZE);
        add(arrivalTimeField, gbc);
        
        // BT
        gbc.gridx=0; gbc.gridy=5;
        add(burstTimeLabel, gbc);
        
        gbc.gridx=1; gbc.gridy=6;
        burstTimeField.setPreferredSize(COMPONENT_SIZE);
        burstTimeField.setMaximumSize(COMPONENT_SIZE);
        add(burstTimeField, gbc);
        
        
        algorithmChoicesBox.addActionListener(e -> {
            if(algorithmChoicesBox.getSelectedIndex() == 1)
                launchWindow.showWindow("sjn");
        });
    }
}
