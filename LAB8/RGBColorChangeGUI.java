import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RGBColorChangeGUI extends JFrame {
    private JComboBox<Integer> redComboBox, greenComboBox, blueComboBox;
    private JPanel colorPanel;

    public RGBColorChangeGUI() {
        setTitle("RGB Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        redComboBox = new JComboBox<>();
        greenComboBox = new JComboBox<>();
        blueComboBox = new JComboBox<>();

        for (int i = 0; i <= 255; i++) {
            redComboBox.addItem(i);
            greenComboBox.addItem(i);
            blueComboBox.addItem(i);
        }

        JButton showOutputButton = new JButton("Show Output");
        showOutputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanelColor();
            }
        });

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        JPanel mainPanel = new JPanel(new GridLayout(4, 2));
        mainPanel.add(new JLabel("Red:"));
        mainPanel.add(redComboBox);
        mainPanel.add(new JLabel("Green:"));
        mainPanel.add(greenComboBox);
        mainPanel.add(new JLabel("Blue:"));
        mainPanel.add(blueComboBox);
        mainPanel.add(showOutputButton);
        mainPanel.add(colorPanel);

        add(mainPanel);
        setVisible(true);
    }

    private void changePanelColor() {
        int red = (int) redComboBox.getSelectedItem();
        int green = (int) greenComboBox.getSelectedItem();
        int blue = (int) blueComboBox.getSelectedItem();

        Color newColor = new Color(red, green, blue);
        colorPanel.setBackground(newColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RGBColorChangeGUI());
    }
}