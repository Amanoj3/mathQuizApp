import javax.swing.*;

public class signUpFrame extends loginFrame {
    JPasswordField retypePassword;
    JLabel retypeLabel;
    @Override
    public void accountOperations() {
        System.out.println("Username: " + userField.getText());
        System.out.println("Password: " + passwordField.getText());
        System.out.println("Confirm password: " + retypePassword.getText());
    }
    signUpFrame(loginFrame loginWindow) {
        super(); // invoke parent constructor (the code underneath involves the unique details of the child class itself)
        retypeLabel = new JLabel("Confirm: ");
        retypeLabel.setBounds(10,95,75,20);
        retypePassword = new JPasswordField(10);
        retypePassword.setBounds(75,95,200,20);
        this.setTitle("Create an account");
        this.add(retypePassword);
        this.add(retypeLabel);
        this.setSize(300,250);
        this.signIn.setBounds(100,150,85,25);
        this.signIn.setText("Sign up");

    }
}
