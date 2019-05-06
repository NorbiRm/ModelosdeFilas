import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton MMSbutton;
    public JPanel panel1;
    private JButton MMSKbutton;
    private JButton MG1button;
    private JButton MD1button;
    private JButton MEK1button;

    public Menu() {
        MMSbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame("MM1 / MMS");
                frame.setContentPane(new MMSform().panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
        MMSKbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame("MMSK");
                frame.setContentPane(new MMSKform().panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
        MG1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame("MG1");
                frame.setContentPane(new MG1form().panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
        MD1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame("MD1");
                frame.setContentPane(new MD1form().panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
        MEK1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame("MEK1");
                frame.setContentPane(new MEk1form().panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
