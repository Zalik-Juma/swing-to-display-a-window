/*
*Name:Zalik Barasa Juma
*Reg No: J77-10594-2024m
*Description: Program for swing to display a window
*/
import javax.swing.*;
import java.awt.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        // i. Create a label
        JLabel label = new JLabel("Enter your name:");
        
        // ii. Create a text field
        JTextField textField = new JTextField(20); // 20 columns wide
        
        // iii. Create a button
        JButton button = new JButton("Submit");
        
        // Add action listener to the button (optional functionality)
        button.addActionListener(e -> {
            String input = textField.getText();
            if (!input.isEmpty()) {
                JOptionPane.showMessageDialog(frame, 
                    "Hello, " + input + "!", 
                    "Greeting", 
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, 
                    "Please enter your name!", 
                    "Warning", 
                    JOptionPane.WARNING_MESSAGE);
            }
        });
        
        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        // Add panel to the frame
        frame.add(panel);
        
        // Center the window on screen
        frame.setLocationRelativeTo(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}