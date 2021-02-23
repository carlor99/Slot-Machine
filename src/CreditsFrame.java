import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.net.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.io.IOException;

public class CreditsFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Test test = new Test();

	/**
	 * Create the frame.
	 */
	public CreditsFrame(int tentativi, int vincite) {
		setTitle("Slot Machine | Credits");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Slot Machine");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(153, 10, 223, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(64, 203, 79, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Linkedin");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(64, 241, 79, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Github");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(64, 279, 79, 28);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JEditorPane editorEmail = new JEditorPane();
		editorEmail.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));
		editorEmail.setFont(new Font("Tahoma", Font.PLAIN, 10));
		editorEmail.setBackground(SystemColor.menu);
		editorEmail.setBounds(151, 203, 242, 28);
		editorEmail.setText("<a title=\"Email\" style=\"color: black; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">carlo.ricchiuti@outlook.com</a>");
		editorEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StringSelection stringSelection = new StringSelection("carlo.ricchiuti@outlook.com");
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				JOptionPane.showMessageDialog(null, "Email copiata negli appunti");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				editorEmail.setText("<a title=\"Email\" style=\"color: gray; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">carlo.ricchiuti@outlook.com</a>");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				editorEmail.setText("<a title=\"Email\" style=\"color: black; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">carlo.ricchiuti@outlook.com</a>");
			}
		});	
		editorEmail.setEditable(false);				
		contentPane.add(editorEmail);
		
		JEditorPane editorLinkedin = new JEditorPane();
		editorLinkedin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		editorLinkedin.setBackground(SystemColor.control);
		editorLinkedin.setBounds(151, 241, 242, 28);
		editorLinkedin.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));
		editorLinkedin.setEditable(false);
		editorLinkedin.setText("<a href=\"https://www.linkedin.com/in/carlo-ricchiuti\" title=\"Linkedin\" style=\"color: black; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">Carlo Ricchiuti</a>");
		editorLinkedin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					final URI uri = new URI("https://www.linkedin.com/in/carlo-ricchiuti");
					if (Desktop.isDesktopSupported()) {
					      try {
					        Desktop.getDesktop().browse(uri);
					      } catch (IOException e1) { /* TODO: error handling */ }
					    } else { /* TODO: error handling */ }
				} catch(URISyntaxException e2) {}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				editorLinkedin.setText("<a title=\"Linkedin\" style=\"color: gray; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">Carlo Ricchiuti</a>");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				editorLinkedin.setText("<a title=\"Linkedin\" style=\"color: black; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">Carlo Ricchiuti</a>");
			}
		});
		contentPane.add(editorLinkedin);
		
		JEditorPane editorGithub = new JEditorPane();		
		editorGithub.setFont(new Font("Tahoma", Font.PLAIN, 10));
		editorGithub.setEditable(false);
		editorGithub.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));
		editorGithub.setBackground(SystemColor.menu);
		editorGithub.setBounds(151, 279, 242, 28);
		editorGithub.setText("<a href=\"https://github.com/carlor99\" title=\"Github\" style=\"color: black; font-family: Tahoma; font-size: 14px;\">carlor99</a>");
		editorGithub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					final URI uri = new URI("https://github.com/carlor99");
					if (Desktop.isDesktopSupported()) {
					      try {
					        Desktop.getDesktop().browse(uri);
					      } catch (IOException e1) { /* TODO: error handling */ }
					    } else { /* TODO: error handling */ }
				} catch(URISyntaxException e2) {}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				editorGithub.setText("<a href=\"https://github.com/carlor99\" title=\"Github\" style=\"color: gray; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">carlor99</a>");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				editorGithub.setText("<a href=\"https://github.com/carlor99\" title=\"Github\" style=\"color: black; font-family: Tahoma; font-size: 14px; text-decoration: underline;\">carlor99</a>");
			}
		});
		contentPane.add(editorGithub);
		
		JLabel lblNewLabel_1 = new JLabel("TENTATIVI");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(163, 65, 145, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("VINCITE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(163, 103, 145, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTentativi = new JLabel("");
		lblTentativi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTentativi.setBounds(318, 65, 28, 28);
		lblTentativi.setText(String.valueOf(tentativi));
		contentPane.add(lblTentativi);
		
		JLabel lblVincite = new JLabel("");
		lblVincite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVincite.setBounds(318, 103, 28, 28);
		lblVincite.setText(String.valueOf(vincite));
		contentPane.add(lblVincite);
	}
}
