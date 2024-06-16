import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApplication extends JFrame {

    private JLabel imageLabel;
    private JLabel messageLabel;
    private JButton startButton;
    private JButton stopButton;
    private Timer timer;
    private int currentIndex;
    private String[] imagePaths;
    private String[] messages;
    private int x, y, width, height;
    private int direction;

    public SwingApplication() {
        // Set up the frame
        setTitle("Image Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(null);

        // Initialize image paths and messages
        imagePaths = new String[]{"1.jpg", "2.jpg", "3.jpg", "4.jpg"};
        messages = new String[]{"Welcome", "Enjoy", "Thanks", "Visit Again"};

        // Initialize components
        imageLabel = new JLabel();
        messageLabel = new JLabel();
        startButton = new JButton("Start Animation");
        stopButton = new JButton("Stop Animation");
        add(imageLabel);
        add(messageLabel);
        add(startButton);
        add(stopButton);

        // Set component bounds
        imageLabel.setBounds(0, 0, 100, 100);
        messageLabel.setBounds(250, 150, 100, 20);
        startButton.setBounds(200, 250, 150, 30);
        stopButton.setBounds(200, 300, 150, 30);

        // Set up the timer
        currentIndex = 0;
        x = 0;
        y = 0;
        width = 100;
        height = 100;
        direction = 0; // 0 = right, 1 = down, 2 = left, 3 = up
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Move the image in a rectangular shape
                if (direction == 0) {
                    x += 1;
                    if (x >= getWidth() - width) {
                        direction = 1;
                    }
                } else if (direction == 1) {
                    y += 1;
                    if (y >= getHeight() - height) {
                        direction = 2;
                    }
                } else if (direction == 2) {
                    x -= 1;
                    if (x <= 0) {
                        direction = 3;
                    }
                } else if (direction == 3) {
                    y -= 1;
                    if (y <= 0) {
                        direction = 0;
                    }
                }

                // Display the current image and message
                imageLabel.setIcon(new ImageIcon(imagePaths[currentIndex]));
                currentIndex = (currentIndex + 1) % imagePaths.length;
                messageLabel.setText(messages[currentIndex]);

                // Set component bounds
                imageLabel.setBounds(x, y, width, height);
                messageLabel.setBounds((getWidth() - 100) / 2, (getHeight() - 20) / 2, 100, 20);
            }
        });

        // Set up action listeners for buttons
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingApplication().setVisible(true);
            }
        });
    }
}