package projekat;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import projekat.Lekar;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import java.awt.SystemColor;

public class GUI extends JFrame {

	private JPanel contentPane;
	Lekar l = new Lekar();
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		contentPane.add(panel, "name_7992917161600");
		
		JTextArea textArea = new JTextArea();

			JButton dugmeZaPoziv = new JButton("Pozovi lekara");
			dugmeZaPoziv.setBounds(131, 108, 198, 62);
			dugmeZaPoziv.setFont(new Font("Perpetua Titling MT", Font.BOLD, 15));
			dugmeZaPoziv.setBackground(Color.RED);
			dugmeZaPoziv.setForeground(Color.BLACK);
			dugmeZaPoziv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
				String unos = textField.getText();
				textArea.setText(unos);
				
				}
			});
			textField = new JTextField();
			textField.setBounds(131, 57, 165, 40);
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			panel.setLayout(null);
			panel.add(textField);
			textField.setColumns(10);
			panel.add(dugmeZaPoziv);
			
			textArea.setBounds(141, 191, 165, 49);
			panel.add(textArea);
			
			JLabel lblUnesiteBroj = new JLabel("UNESITE BROJ VA\u0160EG LEKARA\r\n");
			lblUnesiteBroj.setBackground(SystemColor.info);
			lblUnesiteBroj.setForeground(SystemColor.inactiveCaptionText);
			lblUnesiteBroj.setFont(new Font("Source Serif Pro", Font.BOLD, 15));
			lblUnesiteBroj.setBounds(114, 19, 215, 27);
			panel.add(lblUnesiteBroj);
			
			JButton btnObriiUnos = new JButton("OBRIŠI UNOS");
			btnObriiUnos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textArea.setText("");
					textField.setText("");
				}
			});
			btnObriiUnos.setBounds(10, 124, 111, 34);
			panel.add(btnObriiUnos);
		

	}	
}
