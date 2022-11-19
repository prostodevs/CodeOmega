package Main.Viewer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JButton implements ActionListener {
    private JButton button = new JButton();

    public JButton menuButton(){
        button.setText("Menu");
        button.setVisible(true);
        button.addActionListener(this);
        return button;
    }

    public JButton playButton(){
        button.setText("Play");
        button.setVisible(true);
        button.addActionListener(this);
        return button;
    }

    public JButton settingsButton(){
        button.setText("Settings");
        button.setVisible(true);
        button.addActionListener(this);
        return button;
    }

    public JButton quitButton(JPanel panel){
        button.setText("Quit");
        button.setVisible(true);
        button.addActionListener(e -> {
            int userInput=  JOptionPane.showConfirmDialog(panel, "Are you your you want to quit?",
                    "Caged", JOptionPane.YES_NO_OPTION);
            if(userInput == 0){
                System.exit(1);
            }
        });
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
