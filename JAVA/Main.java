package jradiobuttondemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblID = new JLabel("ID#:"); 
        JTextField tfID = new JTextField(20);
        lblID.setLabelFor(tfID);

        JLabel lblFName = new JLabel("First Name:");
        JTextField tfFName = new JTextField(20);
        lblFName.setLabelFor(tfFName);

        JLabel lblLName = new JLabel("Last Name:");
        JTextField tfLName = new JTextField(20);
        lblLName.setLabelFor(tfLName);

        JLabel lblBirthdate = new JLabel("Birthdate:");
        JTextField tfBirthdate = new JTextField(20);
        lblBirthdate.setLabelFor(tfBirthdate);

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new GridLayout(4, 2));
        namePanel.add(lblID);
        namePanel.add(tfID);
        namePanel.add(lblFName);
        namePanel.add(tfFName);
        namePanel.add(lblLName);
        namePanel.add(tfLName);
        namePanel.add(lblBirthdate);
        namePanel.add(tfBirthdate);

        JRadioButton rdbMale = new JRadioButton("Male");
        rdbMale.setActionCommand("Male");
        JRadioButton rdbFemale = new JRadioButton("Female");
        rdbFemale.setActionCommand("Female");
        JRadioButton rdbOthers = new JRadioButton("Others");
        rdbOthers.setActionCommand("Others");

        ButtonGroup group = new ButtonGroup();
        group.add(rdbMale);
        group.add(rdbFemale);
        group.add(rdbOthers);

        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.Y_AXIS));
        genderPanel.add(new JLabel("Gender:"));
        genderPanel.add(rdbMale);
        genderPanel.add(rdbFemale);
        genderPanel.add(rdbOthers);

        // Submit Button with action listener
        JButton button = new JButton("SUBMIT");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Done Submitting!");
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(genderPanel, BorderLayout.CENTER);
        mainPanel.add(button, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
