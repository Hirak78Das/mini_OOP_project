import javax.swing.JFrame; // main window/frame
import javax.swing.JPanel; // to add buttons, label inside panel
import javax.swing.JPasswordField;
import javax.swing.JLabel; // add label to the panel
import javax.swing.JButton; // add buttom to the panel
import javax.swing.JTextField;

public class BankingSystem extends JFrame {

  public BankingSystem() {
    // Jframe stuff
    // calls the JFrame constructor which creates the GUI window
    super("BankingSystem");

    setSize(300, 400);
    // this method tells JVM to close the application
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // JPanel stuff
    // here we need to create JPanel obj as we can't use super
    JPanel panel = new JPanel();

    // add a welcome label
    JLabel welcomeLabel = new JLabel("welcome to the Banking 'system!");
    panel.add(welcomeLabel);

    JLabel usernameLabel = new JLabel("Username:");
    panel.add(usernameLabel);

    // JTextField usernameField = new JTextField(20); // field width
    // OR
    panel.add(new JTextField(20));

    // Add password label and password field
    JLabel passwordLabel = new JLabel("Password:");
    panel.add(passwordLabel);

    panel.add(new JPasswordField(20));

    // add a button
    JButton loginButton = new JButton("Login");
    panel.add(loginButton); // add button to the panel

    // finally add the panel to the frame
    add(panel);

    setVisible(true);
  }

  public static void main(String[] args) {
    BankingSystem demo = new BankingSystem();
  }
}
