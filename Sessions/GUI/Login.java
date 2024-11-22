import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton enter;
    JTextField uname;
    JPasswordField pwd;
    JLabel unameLabel, pwdLabel, titleLabel;
    Container con;

    public static void main(String[] args) {
        Login log = new Login();
        log.setVisible(true);
        log.setSize(600, 600);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Login() {
        con = getContentPane();
        con.setLayout(null);

       
        con.setBackground(Color.DARK_GRAY);

    
        titleLabel = new JLabel("Welcome");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(120, 20, 200, 30);

        
        unameLabel = new JLabel("Username:");
        unameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        unameLabel.setForeground(Color.WHITE);
        unameLabel.setBounds(50, 80, 100, 25);

        uname = new JTextField(20);
        uname.setBounds(150, 80, 200, 25);
        uname.setBackground(Color.DARK_GRAY);
        uname.setForeground(Color.WHITE);
        uname.setCaretColor(Color.WHITE);

        
        pwdLabel = new JLabel("Password:");
        pwdLabel.setFont(new Font("Arial", Font.BOLD, 16));
        pwdLabel.setForeground(Color.WHITE);
        pwdLabel.setBounds(50, 120, 100, 25);

        pwd = new JPasswordField(20);
        pwd.setBounds(150, 120, 200, 25);
        pwd.setBackground(Color.DARK_GRAY);
        pwd.setForeground(Color.WHITE);
        pwd.setCaretColor(Color.WHITE);

        // Enter Button
        enter = new JButton("ENTER");
        enter.setFont(new Font("Arial", Font.BOLD, 16));
        enter.setBounds(150, 170, 100, 30);
        enter.setBackground(new Color(70, 130, 180));
        enter.setForeground(Color.WHITE);
        enter.setFocusPainted(false);

     
        con.add(titleLabel);
        con.add(unameLabel);
        con.add(uname);
        con.add(pwdLabel);
        con.add(pwd);
        con.add(enter);

       
        enter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter) {
            String username = uname.getText();
            String password = new String(pwd.getPassword());

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }
}
