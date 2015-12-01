   
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class fmTelevisor extends JFrame {

	private JPanel contentPane;
	private JTextField textVolumen;
	private JTextField textCanal;
	
	Televisor tv1= new Televisor ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fmTelevisor frame = new fmTelevisor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fmTelevisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubirVolumen = new JButton("Subir volumen");
		btnSubirVolumen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				tv1.subirVolumen();
				textVolumen.setText(tv1.obtenerVolumen()+"");
			}
		});
		btnSubirVolumen.setBounds(45, 134, 106, 23);
		contentPane.add(btnSubirVolumen);
		
		JButton btnBajarVolumen = new JButton("Bajar volumen");
		btnBajarVolumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.bajarVolumen();
				textVolumen.setText(tv1.obtenerVolumen()+"");
			}
		});
		btnBajarVolumen.setBounds(62, 179, 89, 23);
		contentPane.add(btnBajarVolumen);
		
		
		JButton btnEncender = new JButton("Encender");
		btnEncender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.encender();
				
			}
		});
		btnEncender.setBounds(314, 36, 89, 23);
		contentPane.add(btnEncender);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.apagar();
			}
		});
		btnApagar.setBounds(314, 83, 89, 23);
		contentPane.add(btnApagar);
		
		JButton btnCanal = new JButton("Canal++");
		btnCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.cambiarCanalArriba();
				textCanal.setText("Canal:"+tv1.obtenerCanal()+"");
			}
		});
		btnCanal.setBounds(314, 148, 89, 23);
		contentPane.add(btnCanal);
		
		JButton btnCanal_1 = new JButton("Canal--");
		btnCanal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.cambiarCanalAbajo();
				textCanal.setText("Canal:"+tv1.obtenerCanal()+"");
			}
		});
		btnCanal_1.setBounds(314, 195, 89, 23);
		contentPane.add(btnCanal_1);
		
		textVolumen = new JTextField();
		textVolumen.setBounds(164, 60, 139, 20);
		contentPane.add(textVolumen);
		textVolumen.setColumns(10);
		
		textCanal = new JTextField();
		textCanal.setText("");
		textCanal.setBounds(164, 98, 140, 20);
		contentPane.add(textCanal);
		textCanal.setColumns(10);
		
	}
}

