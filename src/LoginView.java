import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginView frame = new LoginView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		contentPane.add(idLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		contentPane.add(passLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		contentPane.add(btnNewButton);
		
		
	}
	public void run()
	{
		LoginView frame = new LoginView();
		frame.setVisible(true);
		
	}
}
