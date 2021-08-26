import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginFrame extends JFrame {

    private signUpFrame createAccountFrame;

    //user variables
    protected JTextField userField;
    protected JLabel userLabel;

    // password variables
    protected JPasswordField passwordField;
    protected JLabel passwordLabel;

    // login button
    protected JButton signIn;

    public void accountOperations() { // invoke DB operations here
        System.out.println("Username: " + userField.getText());
        System.out.println("Password: " + passwordField.getText());
    }

    loginFrame() {
        createAccountFrame = new signUpFrame(this);
        //login button
        signIn = new JButton("Sign in");
        signIn.setBounds(100,100,75,25);

        //username field
        userField = new JTextField(10);
        userField.setBounds(75,30,200,20);

        //password field
        passwordField = new JPasswordField(10);
        passwordField.setBounds(75,65,200,20);

        // username label
        userLabel = new JLabel("Username: ");
        userLabel.setBounds(10,30,75,20);

        // password label
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,65,75,20);

        // adding all the components to the loginFrame
        this.add(userLabel);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(userField);
        this.add(signIn);

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountOperations();
            }
        });

        //establishing the necessary properties of the loginFrame
        this.setLayout(null);
        this.setTitle("Login");
        this.setSize(300,200);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}