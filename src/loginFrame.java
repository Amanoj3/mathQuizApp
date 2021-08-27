import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginFrame extends JFrame implements databaseOperations {

    private signUpFrame createAccountFrame;
    protected JButton createAccountBtn;
    //user variables
    protected JTextField userField;
    protected JLabel userLabel;

    // password variables
    protected JPasswordField passwordField;
    protected JLabel passwordLabel;

    // login button
    protected final JButton signIn;

    public void accountOperations() { // invoke DB operations here
        System.out.println("Username: " + userField.getText());
        System.out.println("Password: " + passwordField.getText());
    }

    private void create_Account_Frame() {
        createAccountFrame = new signUpFrame(this);
        this.setVisible(false);
    }

    loginFrame() {
        //login button
        signIn = new JButton("Sign in");
        signIn.setBounds(50,100,75,25);
        //button that lets you create an account
        createAccountBtn = new JButton("Sign up");
        createAccountBtn.setBounds(150,100,85,25);

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
        this.add(createAccountBtn);

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountOperations();
            }
        });

        createAccountBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                create_Account_Frame();
            }
        });

        //establishing the necessary properties of the loginFrame
        this.setLayout(null);
        this.setTitle("Login");
        this.setSize(300,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}