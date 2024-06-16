import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringOperationGUI extends JFrame {
    private JTextField inputField, outputField;

    public StringOperationGUI() {
        setTitle("String Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        inputField = new JTextField(20);
        outputField = new JTextField(20);
        outputField.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 3));

        String[] buttonLabels = {"Concatenate", "Uppercase", "Lowercase", "Reverse", "Clear", "Exit"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    performStringOperation(button.getText());
                }
            });
            buttonPanel.add(button);
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputField, BorderLayout.NORTH);
        mainPanel.add(outputField, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private void performStringOperation(String operation) {
        String input = inputField.getText();
        String result = "";

        switch (operation) {
            case "Concatenate":
                result = input + input;
                break;
            case "Uppercase":
                result = input.toUpperCase();
                break;
            case "Lowercase":
                result = input.toLowerCase();
                break;
            case "Reverse":
                result = new StringBuilder(input).reverse().toString();
                break;
            case "Clear":
                inputField.setText("");
                outputField.setText("");
                return;
            case "Exit":
                System.exit(0);
        }

        outputField.setText(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StringOperationGUI());
    }
}