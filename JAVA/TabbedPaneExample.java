import javax.swing.*;
import java.awt.event.*;

public class ThreeTabGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Tab GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1 = new JPanel();
        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField numberField = new JTextField(10);
        JButton checkButton = new JButton("Check");
        JLabel resultLabel = new JLabel("");

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    if (number % 2 == 0) {
                        resultLabel.setText(number + " is Even.");
                    } else {
                        resultLabel.setText(number + " is Odd.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter an integer.");
                }
            }
        });

        tab1.add(inputLabel);
        tab1.add(numberField);
        tab1.add(checkButton);
        tab1.add(resultLabel);

        JPanel tab2 = new JPanel();
        tab2.add(new JLabel("This is Tab 2"));

        JPanel tab3 = new JPanel();
        tab3.add(new JLabel("You are now in Tab 3"));

        tabbedPane.addTab("Odd/Even", tab1);
        tabbedPane.addTab("Tab 2", tab2);
        tabbedPane.addTab("Tab 3", tab3);

        frame.add(tabbedPane);

        frame.setVisible(true);
    }
}
