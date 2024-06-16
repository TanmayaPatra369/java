import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticOperationGUI extends JFrame {
    private JTextField firstNumberField, secondNumberField, resultField;

    public ArithmeticOperationGUI() {
        setTitle("Arithmetic Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel firstNumberLabel = new JLabel("Enter the First Number:");
        firstNumberField = new JTextField(10);

        JLabel secondNumberLabel = new JLabel("Enter the Second Number:");
        secondNumberField = new JTextField(10);

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('+');
            }
        });

        JButton subButton = new JButton("Subtract");
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('-');
            }
        });

        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('*');
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumberField.setText("");
                secondNumberField.setText("");
                resultField.setText("");
            }
        });

        panel.add(firstNumberLabel);
        panel.add(firstNumberField);
        panel.add(secondNumberLabel);
        panel.add(secondNumberField);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(multiplyButton);
        panel.add(resetButton);

        add(panel);
        setVisible(true);
    }

    private void performOperation(char operator) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ArithmeticOperationGUI());
    }
}