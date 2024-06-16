import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField displayField;

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        displayField = new JTextField();
        displayField.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/",
                                 "4", "5", "6", "*",
                                 "1", "2", "3", "-",
                                 "C", "0", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String buttonText = button.getText();
                    if (buttonText.equals("=")) {
                        calculateResult();
                    } else if (buttonText.equals("C")) {
                        clearDisplay();
                    } else {
                        displayField.setText(displayField.getText() + buttonText);
                    }
                }
            });
            buttonPanel.add(button);
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(displayField, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    private void calculateResult() {
        String expression = displayField.getText();
        try {
            double result = evaluateExpression(expression);
            displayField.setText(String.valueOf(result));
        } catch (ArithmeticException | NumberFormatException ex) {
            displayField.setText("Error");
        }
    }

    private double evaluateExpression(String expression) {
        // Implement expression evaluation logic here
        return 0.0;
    }

    private void clearDisplay() {
        displayField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorGUI());
    }
}