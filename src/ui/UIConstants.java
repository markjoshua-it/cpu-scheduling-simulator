package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class UIConstants {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final Dimension PANEL_SIZE = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
    public static final Dimension COMPONENT_SIZE = new Dimension(600, 40);
    public static final Font TITLE_FONT = new Font("JetBrains Mono", Font.PLAIN, 30);
    public static final String[] ALGORITHM_CHOICES = {
                            "First-Come First-Served (FCFS)", 
                            "Shortest Job Next (SJN)", 
                            "Round Robin (RR)"};
   public static final String LABEL_ALGORITHM = "Algorithm";
   public static final String LABEL_ARRIVAL = "Arrival Time";
   public static final String LABEL_BURST = "Burst Time";
   public static final String LABEL_QUANTUM = "Time Quantum";
   public static final Color yourGreen = new Color(44, 110, 73);
}



