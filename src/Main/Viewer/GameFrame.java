package Main.Viewer;

import javax.swing.*;

public class GameFrame extends JFrame {
    private JFrame frame = new JFrame();

    public void initialize(){
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        startMenu();
    }

    public void startMenu() {
        frame.add(new Panels().mainMenu());
        frame.setVisible(true);
    }

    public void settingMenu(JFrame frame) {

    }

    public void playScreen() {
        frame.add(new Panels().playScreen());
        frame.setVisible(true);
    }
}
