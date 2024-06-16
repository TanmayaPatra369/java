import javax.swing.*;
import java.awt.*;

public class Question1 extends JFrame {
    public Question1() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(4, 20);

        JLabel subscribeLabel = new JLabel("Subscribe to Newsletter:");
        JCheckBox subscribeCheckBox = new JCheckBox();

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JLabel countryLabel = new JLabel("Country:");
        String[] countries = {"USA", "Canada", "UK", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        JLabel hobbiesLabel = new JLabel("Hobbies:");
        String[] hobbies = {"Reading", "Gaming", "Traveling", "Cooking"};
        JList<String> hobbiesList = new JList<>(hobbies);

        ImageIcon logoIcon = new ImageIcon("logo.png");
        JLabel logoLabel = new JLabel(logoIcon);

        JButton submitButton = new JButton("Submit");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(addressLabel);
        panel.add(addressArea);
        panel.add(subscribeLabel);
        panel.add(subscribeCheckBox);
        panel.add(genderLabel);
        panel.add(maleRadioButton);
panel.add(new JLabel());
        panel.add(femaleRadioButton);
        panel.add(countryLabel);
        panel.add(countryComboBox);
        panel.add(hobbiesLabel);
        panel.add(hobbiesList);
        panel.add(logoLabel);
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Question1());
    }
}