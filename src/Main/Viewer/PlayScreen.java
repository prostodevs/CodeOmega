package Main.Viewer;

import javax.swing.*;
import java.awt.*;

public class PlayScreen {
    private JPanel gamePanel = new JPanel();

    public JPanel main(JPanel panel){
        panel.setLayout(new BorderLayout());
        gamePanel.add(new Buttons().quitButton(panel), BorderLayout.SOUTH);
        return panel;
    }
}
