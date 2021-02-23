import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class SlotFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Test test = new Test();

	/**
	 * Create the frame.
	 */
	public SlotFrame() {
		setTitle("Slot Machine | Carlo Ricchiuti");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		
		PanelImmagine panelRes1 = new PanelImmagine();
		panelRes1.setBounds(36, 10, 185, 187);
		contentPane.add(panelRes1);
		panelRes1.setLayout(new GridLayout(1, 0, 0, 0));
		
		PanelImmagine panelRes2 = new PanelImmagine();
		panelRes2.setBounds(286, 10, 185, 187);
		contentPane.add(panelRes2);
		panelRes2.setLayout(new GridLayout(1, 0, 0, 0));
		
		PanelImmagine panelRes3 = new PanelImmagine();
		panelRes3.setBounds(539, 10, 185, 187);
		contentPane.add(panelRes3);
		panelRes3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblTentativi = new JLabel("0");
		lblTentativi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTentativi.setHorizontalAlignment(SwingConstants.CENTER);
		lblTentativi.setBounds(716, 247, 28, 28);
		contentPane.add(lblTentativi);
		
		JLabel lblVincite = new JLabel("0");
		lblVincite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVincite.setHorizontalAlignment(SwingConstants.CENTER);
		lblVincite.setBounds(716, 282, 28, 28);
		contentPane.add(lblVincite);
		
		JLabel lblNewLabel = new JLabel("Tentativi");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(637, 247, 69, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblVincite_1 = new JLabel("Vincite");
		lblVincite_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVincite_1.setBounds(637, 282, 69, 28);
		contentPane.add(lblVincite_1);
		
		JLabel lblNewLabel_1 = new JLabel("Perc. vincite");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(287, 257, 80, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPercVincite = new JLabel("0");
		lblPercVincite.setHorizontalAlignment(SwingConstants.LEFT);
		lblPercVincite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercVincite.setBounds(377, 257, 80, 28);
		contentPane.add(lblPercVincite);
		

		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test.incrementaTentativi();
				lblTentativi.setText(String.valueOf(test.getTentativi()));

				
				int res1 = test.generaRisultato();				
				int res2 = test.generaRisultato();
				int res3 = test.generaRisultato();
				System.out.println("I risultati sono " + res1 + " " + res2 + " " + res3);	
				
				panelRes1.setImageIndex(res1);
				panelRes2.setImageIndex(res2);
				panelRes3.setImageIndex(res3);
				
				if(res1 == res2 && res2 == res3) {
					JOptionPane.showMessageDialog(null, "HAI VINTO!");
					System.out.println("HAI VINTO!");
					test.incrementaVincite();
					lblVincite.setText(String.valueOf(test.getVincite()));
				}	
				
				test.setPercVincite();
				lblPercVincite.setText(String.valueOf(test.getPercVinciteFormat()) + " %");
			}
		});
		btnNew.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNew.setBounds(36, 377, 195, 52);
		contentPane.add(btnNew);
		
		JButton btnChiudi = new JButton("Chiudi");
		btnChiudi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test.mostraStats();
				dispose();
			}
		});
		btnChiudi.setBounds(668, 399, 93, 30);
		contentPane.add(btnChiudi);
		
		
		
		
	}
}
