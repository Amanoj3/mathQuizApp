import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUpFrame extends loginFrame {
    JPasswordField retypePassword;
    JLabel retypeLabel;
    JButton backButton;
    public void backToLogin(loginFrame loginWindow) {
        this.setVisible(false);
        loginWindow.setVisible(true);
    }
    public void accountOperations() {
        System.out.println("Username: " + userField.getText());
        System.out.println("Password: " + passwordField.getText());
        System.out.println("Confirm password: " + retypePassword.getText());
    }
    signUpFrame(loginFrame loginWindow) {
        super(); // invoke parent constructor (the code underneath involves the unique details of the child class itself)
        backButton = new JButton("Go back");
        backButton.setBounds(150,150,125,25);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backToLogin(loginWindow);
            }
        });

        retypeLabel = new JLabel("Confirm: ");
        retypeLabel.setBounds(10,95,75,20);
        retypePassword = new JPasswordField(10);
        retypePassword.setBounds(75,95,200,20);
        this.setTitle("Create an account");
        this.add(retypePassword);
        this.add(retypeLabel);
        this.setSize(300,250);
        this.add(backButton);
        this.signIn.setBounds(10,150,125,25);
        this.signIn.setText("Create account");
        this.createAccountBtn.setVisible(false);
    }
}
