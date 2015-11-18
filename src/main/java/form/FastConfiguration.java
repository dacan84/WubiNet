package form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FastConfiguration extends JDialog {
    private JPanel contentPane;
    private JButton buttonExit;

    private JButton buttonWriteAll;
    private JButton buttonGenerateName;
    private JButton buttonBack;


    public FastConfiguration(Point position, Dimension dimension) {
        setLocation(position);
        setSize(dimension);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonGenerateName);
        pack();
        setVisible(true);

        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onClickButtonBack();
            }
        });
    }

    private void onClickButtonBack() {
        System.out.print("esto hace algo");
        remove(contentPane);
        setVisible(false);
        dispose();
    }
}
