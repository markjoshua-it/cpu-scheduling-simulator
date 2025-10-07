package algorithm;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ui.LaunchWindow;
import static ui.UIConstants.*;

public class Sjn extends JPanel{
    
    private final JLabel inputLabel = new JLabel("SJN - Input");
    private final JLabel algorithmLabel = new JLabel(LABEL_ALGORITHM);
    private final JComboBox algorithmChoicesBox = new JComboBox(ALGORITHM_CHOICES);
    private final JLabel arrivalTimeLabel = new JLabel(LABEL_ARRIVAL);
    private final JTextField arrivalTimeField = new JTextField();
    private final JLabel burstTimeLabel = new JLabel(LABEL_BURST);
    private final JTextField burstTimeField = new JTextField();
    private final JButton solve = new JButton("Solve");
    private final GridBagLayout gridBagLayout = new GridBagLayout();
    private final GridBagConstraints gbc = new GridBagConstraints();
    
    public Sjn(LaunchWindow launchWindow){
        algorithmChoicesBox.setSelectedIndex(1);
        setLayout(gridBagLayout);
        setPreferredSize(PANEL_SIZE);
        
        // INPUT
        gbc.insets = new Insets(-150, 140, 0, 0);
        gbc.gridx=0; gbc.gridy=0;
        gbc.gridwidth=5;
        gbc.anchor = GridBagConstraints.CENTER;
        inputLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 50));
        add(inputLabel, gbc);
        
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
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
        
        // Button
        gbc.insets = new Insets(50, 0, 0, 0);
        gbc.gridx=1; gbc.gridy=7;
        gbc.fill = GridBagConstraints.NONE;
        solve.setPreferredSize(new Dimension(300, 40));
        solve.setMaximumSize(new Dimension(300, 40));
        add(solve, gbc);
        
        algorithmChoicesBox.addActionListener(e -> {
            launchWindow.showWindow(algorithmChoicesBox.getSelectedIndex());
        });
        
        solve.addActionListener(e->{
            String numStrAT =  arrivalTimeField.getText().trim();
            String arrATNum[] = numStrAT.split("\\s+");
            String numStrBT =  burstTimeField.getText().trim();
            String arrBTNum[] = numStrBT.split("\\s+");
            int arrivalTimeInput[] = new int[arrATNum.length];
            int burstTimeInput[] = new int[arrATNum.length];
            
            for (int i = 0; i < arrATNum.length; i++) {
                arrivalTimeInput[i] = Integer.parseInt(arrATNum[i]);
                burstTimeInput[i] = Integer.parseInt(arrBTNum[i]);
            }
        });
    }
}
