package Main.Viewer;

import javax.swing.*;

/*
 * This class will be the "cross-dock" for the various panels
 * used during gameplay (this class is called from GameFrame)
 *
 */
public class Panels extends JPanel {
    private JPanel panel = new JPanel();

    public JPanel mainMenu() {
        panel.add(new MainMenu().main(panel));
        panel.setVisible(true);

        return panel;
    }

    public JPanel playScreen(){
        panel.add(new PlayScreen().main(panel));
        panel.setVisible(true);

        return panel;
    }
}
