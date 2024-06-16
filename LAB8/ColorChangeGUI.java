import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeGUI extends JFrame {
    private JPanel colorPanel;
    private JList<String> colorList;

    public ColorChangeGUI() {
        setTitle("Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorList = new JList<>(colors);

        JButton changeColorButton = new JButton("Change Color");
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanelColor();
            }
        });

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(colorList, BorderLayout.WEST);
        mainPanel.add(changeColorButton, BorderLayout.CENTER);
        mainPanel.add(colorPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private void changePanelColor() {
        String selectedColor = colorList.getSelectedValue();
        if (selectedColor != null) {
            switch (selectedColor) {
                case "Red":
                    colorPanel.setBackground(Color.RED);
                    break;
                case "Green":
                    colorPanel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    colorPanel.setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    colorPanel.setBackground(Color.YELLOW);
                    break;
                default:
                    colorPanel.setBackground(Color.WHITE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorChangeGUI());
    }
}