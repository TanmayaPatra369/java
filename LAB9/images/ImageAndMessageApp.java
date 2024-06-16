package images;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageAndMessageApp extends JFrame {
    private List<Image> images;
    private JLabel messageLabel;
    private JPanel imagePanel;

    public ImageAndMessageApp() {
        images = new ArrayList<>();
        // Load images into the 'images' list

        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw images in the panel
            }
        };

        add(messageLabel, BorderLayout.NORTH);
        add(imagePanel, BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Thread imageThread = new Thread(new ImageAnimator());
        Thread messageThread = new Thread(new MessageDisplayer());
        imageThread.start();
        messageThread.start();
    }

    class ImageAnimator implements Runnable {
        @Override
        public void run() {
            // Implement image animation logic here
        }
    }

    class MessageDisplayer implements Runnable {
        private String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};

        @Override
        public void run() {
            for (String message : messages) {
                SwingUtilities.invokeLater(() -> messageLabel.setText(message));
                try {
                    Thread.sleep(1000); // 1 second delay between messages
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageAndMessageApp());
    }
}