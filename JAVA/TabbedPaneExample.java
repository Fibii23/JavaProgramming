import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TabbedPaneExample extends JPanel {
    public TabbedPaneExample() {
        super(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab 1: Odd/Even Number Identifier
        JComponent tab1 = createOddEvenTab();
        tabbedPane.addTab("Tab 1", null, tab1, "Check if a number is odd or even");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        // Tab 2: Placeholder Panel
        JComponent tab2 = createPlaceholderTab("Panel #2");
        tabbedPane.addTab("Tab 2", null, tab2, "Second tab");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        // Tab 3: Placeholder Panel
        JComponent tab3 = createPlaceholderTab("Panel #3");
        tabbedPane.addTab("Tab 3", null, tab3, "Third tab");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        // Add the tabbed pane to this panel
        add(tabbedPane);

        // Enable scrolling tabs if needed
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    // Tab 1: Odd/Even Number Identifier
    private JComponent createOddEvenTab() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 5, 5));

        JLabel instructionLabel = new JLabel("Enter a number:");
        JTextField numberInputField = new JTextField();
        JButton checkButton = new JButton("Check");
        JLabel resultLabel = new JLabel("");

        checkButton.addActionListener(e -> {
            String userInput = numberInputField.getText();
            try {
                int number = Integer.parseInt(userInput);
                if (number % 2 == 0) {
                    resultLabel.setText("Result: Even");
                } else {
                    resultLabel.setText("Result: Odd");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid integer.");
            }
        });

        panel.add(instructionLabel);
        panel.add(numberInputField);
        panel.add(checkButton);
        panel.add(resultLabel);

        return panel;
    }

    // Tabs 2 and 3: Placeholder Panels
    private JComponent createPlaceholderTab(String text) {
        JPanel panel = new JPanel(new GridBagLayout());
        JLabel label = new JLabel(text);
        panel.add(label);
        return panel;
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("TabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TabbedPaneExample(), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
