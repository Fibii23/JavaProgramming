import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThreeTabGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Tab GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);

        JTabbedPane tabbedPane = new JTabbedPane();

        // --- Tab 1: Odd/Even Checker ---
        JPanel tab1 = new JPanel(new BorderLayout(10, 10));
        tab1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Odd or Even Checker"));

        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField numberField = new JTextField(10);

        inputPanel.add(inputLabel);
        inputPanel.add(numberField);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton checkButton = new JButton("Check");
        JButton clearButton = new JButton("Clear");
        buttons.add(checkButton);
        buttons.add(clearButton);

        JLabel resultLabel = new JLabel(" ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 13));

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText().trim());
                    resultLabel.setForeground(Color.BLACK);
                    resultLabel.setText(number + (number % 2 == 0 ? " is Even." : " is Odd."));
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

        tab1.add(inputPanel, BorderLayout.NORTH);
        tab1.add(buttons, BorderLayout.CENTER);
        tab1.add(resultLabel, BorderLayout.SOUTH);

        // --- Tab 2: Basic Info Form ---
        JPanel tab2 = new JPanel(new BorderLayout(10, 10));
        tab2.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel lblID = new JLabel("ID#:"); 
        JTextField tfID = new JTextField(20);

        JLabel lblFName = new JLabel("First Name:");
        JTextField tfFName = new JTextField(20);

        JLabel lblLName = new JLabel("Last Name:");
        JTextField tfLName = new JTextField(20);

        JLabel lblBirthdate = new JLabel("Birthdate:");
        JTextField tfBirthdate = new JTextField(20);

        JPanel namePanel = new JPanel(new GridLayout(4, 2, 10, 10));
        namePanel.setBorder(BorderFactory.createTitledBorder("Basic Info"));
        namePanel.add(lblID);
        namePanel.add(tfID);
        namePanel.add(lblFName);
        namePanel.add(tfFName);
        namePanel.add(lblLName);
        namePanel.add(tfLName);
        namePanel.add(lblBirthdate);
        namePanel.add(tfBirthdate);

        JRadioButton rdbMale = new JRadioButton("Male");
        JRadioButton rdbFemale = new JRadioButton("Female");
        JRadioButton rdbOthers = new JRadioButton("Others");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdbMale);
        genderGroup.add(rdbFemale);
        genderGroup.add(rdbOthers);

        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.Y_AXIS));
        genderPanel.setBorder(BorderFactory.createTitledBorder("Gender"));
        genderPanel.add(rdbMale);
        genderPanel.add(rdbFemale);
        genderPanel.add(rdbOthers);

        JButton submitButton = new JButton("SUBMIT");
        submitButton.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "Done Submitting!")
        );

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(submitButton);

        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(namePanel, BorderLayout.NORTH);
        centerPanel.add(genderPanel, BorderLayout.CENTER);

        tab2.add(centerPanel, BorderLayout.CENTER);
        tab2.add(bottomPanel, BorderLayout.SOUTH);

        // --- Tab 3: Placeholder ---
        JPanel tab3 = new JPanel();
        tab3.add(new JLabel("You are now in Tab 3"));

        // Add Tabs to TabbedPane
        tabbedPane.addTab("Odd/Even", tab1);
        tabbedPane.addTab("Basic Info", tab2);
        tabbedPane.addTab("Tab 3", tab3);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
