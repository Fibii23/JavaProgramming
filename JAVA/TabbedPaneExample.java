import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThreeTabGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Tab GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1 = new JPanel();
        tab1.setLayout(new BoxLayout(tab1, BoxLayout.Y_AXIS));
        tab1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField numberField = new JTextField(10);
        inputPanel.add(inputLabel);
        inputPanel.add(numberField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton checkButton = new JButton("Check");
        JButton clearButton = new JButton("Clear");
        buttonPanel.add(checkButton);
        buttonPanel.add(clearButton);

        JLabel resultLabel = new JLabel(" ");
        resultLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 12));

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    resultLabel.setForeground(Color.BLACK);
                    if (number % 2 == 0) {
                        resultLabel.setText(number + " is Even.");
                    } else {
                        resultLabel.setText(number + " is Odd.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setForeground(Color.RED);
                    resultLabel.setText("Invalid input. Please enter an integer.");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberField.setText("");
                resultLabel.setText(" ");
                resultLabel.setForeground(Color.BLACK);
            }
        });

        tab1.add(inputPanel);
        tab1.add(buttonPanel);
        tab1.add(Box.createRigidArea(new Dimension(0, 10)));
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
