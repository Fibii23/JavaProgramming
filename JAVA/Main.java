package jradiobuttondemo;
import java.awt.*;
import javax. swing.*; import java.awt.event.*;
public
class Main {
public static void main(String[] args) {
Frame frame = new JFrame("Basic Information");
frame. setDefaultCloseOperation(JFrame. EXIT _ON_CLOSE);
JLabel 1blID = new JLabel("ID#:");
TextField tfID - new TextField (20);
161ID. setLabelFor(tfID);
JLabel IblFName = new JLabel("First Name:");
TextField tfFName = new JTextField(20);
1blFName.setLabelFor (tfFName);
JLabel IbILName - new JLabel("Last Name:");
TextField tfLName = new JTextField(20);
1bILName.setLabelFor(tfLName);
JLabel lblBirthdate = new JLabel("Birthdate:");
TextField tBirthdate - new JTextField(20);
IblBirthdate.setLabelFor(tfBirthdate);
Panel namePanel - new JPanel();
namePanel.setLayout(new GridLayout(4, 2));
namePanel. add (1blID);
namePanel. add(tfID);
namePanel. add (1blFName);
namePanel. add(tfFName);
namePanel. add (IbILName);
namePanel, add (tfLName);
namePanel. add (1blBirthdate);
namePanel. add(tfBirthdate);
JRadioButton rdbMale - new JRadioButton("Male"):
rdbMale-setActionCommand ("Male"):
RadioButton rdbFemale - new JRadioButton("Female");
rdbFemale, setActionCommand ("Female");
JRadioButton rdbMale = new JRadioButton("Male");
rdbMale.setActionCommand ("Male");
JRadioButton rdbFemale = new JRadioButton ("Female");
rdbFemale.setActionCommand ("Female");
JRadioButton rdbothers - new JRadioButton("Others"); rdbothers.setActionCommand ("Others");
ButtonGroup group = new ButtonGroup);
group. add (rdbMale); group. add (rdbFemale); group. add (rdbothers);
Panel genderPanel - new JPanel();
genderPanel. setLayout (new BoxLayout (genderPanel, BoxLayout. Y_AXIS)); genderPanel. add (new JLabel("Gender:""): genderPanel. add (rdbMale); genderPanel. add (rdbFemale); genderPanel.add(rdbOthers);
Button button = new Button ("SUBMIT");
button.addActionListener(new ActionListener) (
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane-showMessageDialog(frame, "Done Submitting!");
Panel mainPanel - new JPanel(); mainPanel, setLayout (new BorderLayout()):
mainPane],add(namePanel, BorderLayout.NORTH);
mainPanel, add(genderPanel, BorderLayout. CENTER);
mainPanel. add (button, BorderLayout, SOUTH) ; frame, getContentPane() • add(mainPanel);
frame, pack()3
frame-setvisible(true);
}