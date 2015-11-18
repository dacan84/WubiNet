package form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JDialog {
    private JPanel contentPane;
    private JButton buttonFastConfiguration;
    private JButton buttonAdvancedConfiguration;
    private JPanel panelIcon;
    private JButton buttonExit;
    private JLabel lblIcon;

    public MainMenu() {

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonFastConfiguration);
        buttonFastConfiguration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
// add your code here
        Point location = new Point(getLocation());
        Dimension dimension = new Dimension(getSize());
        setVisible(false);
        //dispose();
        FastConfiguration fastConfiguration = new FastConfiguration(location,dimension);
        fastConfiguration.setVisible(true);
       // setVisible(false);
        //dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

  /*  public static void main(String[] args) {
        MainMenu dialog = new MainMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }*/

}
