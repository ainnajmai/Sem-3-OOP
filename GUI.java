import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener {

    private int count = 0; // Counter for button clicks
    private JLabel label; // Label to display the count
    private JFrame frame; // Frame to hold the components
    private JPanel panel; // Panel to organize components

    public GUI() {
        // Initialize the JFrame and other components
        frame = new JFrame();

        // Create the button and set its action listener
        JButton button = new JButton("Click me");
        button.addActionListener(this);

        // Initialize the label
        label = new JLabel("Number of clicks: 0");

        // Create and set up the panel
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1)); // Layout for button and label
        panel.add(button);
        panel.add(label);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack(); // Fit the window size to the components
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI(); // Create and show the GUI
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Increment the count and update the label text
        count++;
        label.setText("Number of clicks: " + count);
    }
}
