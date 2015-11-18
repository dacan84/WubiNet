import javax.swing.*;
import form.MainMenu;
/**
 * Created by Diego on 17/11/2015.
 */
public class Main extends JDialog{

    public static void main(String[] args) {
        MainMenu dialog = new MainMenu();
        dialog.pack();
        dialog.setVisible(true);
        //System.exit(0);
    }

}
