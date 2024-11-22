import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage extends JFrame implements ActionListener {

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Set background color
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setLayout(new BorderLayout());
        backgroundPanel.setBackground(new Color(220, 220, 220));

        // Create panel for form elements with padding and spacing
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        formPanel.setBackground(Color.WHITE);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding between form elements
        gbc.anchor = GridBagConstraints.WEST;

        // Font for labels and buttons
        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Font fieldFont = new Font("Arial", Font.PLAIN, 14);

        // Create form elements
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(labelFont);
        JTextField nameField = new JTextField(15);
        nameField.setFont(fieldFont);
        
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(labelFont);
        JTextField emailField = new JTextField(15);
        emailField.setFont(fieldFont);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(labelFont);
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setFont(fieldFont);
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setFont(labelFont);
        JPasswordField confirmPasswordField = new JPasswordField(15);
        confirmPasswordField.setFont(fieldFont);

        // Add form elements to the panel with positioning
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(nameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(emailLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(confirmPasswordLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(confirmPasswordField, gbc);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBackground(Color.WHITE);

        // Create and style buttons
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(100, 150, 220));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(new Font("Arial", Font.BOLD, 14));

        JButton resetButton = new JButton("Reset");
        resetButton.setBackground(new Color(200, 80, 80));
        resetButton.setForeground(Color.WHITE);
        resetButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Add buttons to the button panel
        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);

        // Set main frame layout
        frame.setLayout(new BorderLayout());

        // Add form panel and button panel to the main frame
        backgroundPanel.add(formPanel, BorderLayout.CENTER);
        backgroundPanel.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(backgroundPanel);

        // Add action listener to submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                // Validate if passwords match and fields are not empty
                if (password.equals(confirmPassword) && !name.isEmpty() && !email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Registration Successful!");
                    // Optionally, clear form fields after successful registration
                    nameField.setText("");
                    emailField.setText("");
                    passwordField.setText("");
                    confirmPasswordField.setText("");
                } else {
                    String errorMessage = "";
                    if (!password.equals(confirmPassword)) {
                        errorMessage += "Passwords do not match. ";
                    }
                    if (name.isEmpty()) {
                        errorMessage += "Name cannot be empty. ";
                    }
                    if (email.isEmpty()) {
                        errorMessage += "Email cannot be empty.";
                    }
                    JOptionPane.showMessageDialog(frame, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add action listener for reset button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear form fields on reset button click
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
            }
        });

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This can be used if needed for other actions
    }
}
