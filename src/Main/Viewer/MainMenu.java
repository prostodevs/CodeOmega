package Main.Viewer;

import javax.swing.*;
import java.awt.*;

public class MainMenu {
    private JPanel imagePanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    public JPanel main(JPanel panel){
        panel.setLayout(new BorderLayout());
        imagePanel.add(new JButton("Test"));
        buttonPanel.add(new Buttons().playButton());
        buttonPanel.add(new Buttons().settingsButton());
        buttonPanel.add(new Buttons().quitButton(buttonPanel));
        panel.add(imagePanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        return panel;
    }
}
