package windowCNP;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class wCNP {

	private JFrame frame;
	private JTextField cnpField;
	private JTextField genderField;
	private JTextField bornField;
	private JTextField ageField;
	private JTextField cityField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wCNP window = new wCNP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wCNP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("CNP scanner");
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Introduceti CNP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(112, 25, 220, 43);
		frame.getContentPane().add(lblNewLabel);
		
		cnpField = new JTextField();
		cnpField.setHorizontalAlignment(SwingConstants.CENTER);
		cnpField.setBounds(149, 79, 144, 20);
		frame.getContentPane().add(cnpField);
		cnpField.setColumns(10);
		
		JButton btnDone = new JButton("Scan");
		btnDone.setBounds(175, 110, 89, 23);
		frame.getContentPane().add(btnDone);
		frame.getRootPane().setDefaultButton(btnDone);
		
		JLabel gender = new JLabel("Gen");
		gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		gender.setBounds(31, 164, 34, 14);
		frame.getContentPane().add(gender);
		
		genderField = new JTextField();
		genderField.setHorizontalAlignment(SwingConstants.CENTER);
		genderField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		genderField.setBackground(Color.LIGHT_GRAY);
		genderField.setBounds(10, 189, 78, 20);
		frame.getContentPane().add(genderField);
		genderField.setColumns(10);
		
		JLabel lblBorn = new JLabel("Data nasterii");
		lblBorn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBorn.setBounds(112, 160, 97, 23);
		frame.getContentPane().add(lblBorn);
		
		bornField = new JTextField();
		bornField.setHorizontalAlignment(SwingConstants.CENTER);
		bornField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bornField.setColumns(10);
		bornField.setBackground(Color.LIGHT_GRAY);
		bornField.setBounds(112, 189, 97, 20);
		frame.getContentPane().add(bornField);
		
		JLabel lblAge = new JLabel("Varsta");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAge.setBounds(234, 164, 49, 14);
		frame.getContentPane().add(lblAge);
		
		ageField = new JTextField();
		ageField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ageField.setHorizontalAlignment(SwingConstants.CENTER);
		ageField.setBackground(Color.LIGHT_GRAY);
		ageField.setBounds(234, 188, 49, 20);
		frame.getContentPane().add(ageField);
		ageField.setColumns(10);
		
		JLabel lblCity = new JLabel("Oras");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setBounds(339, 164, 46, 14);
		frame.getContentPane().add(lblCity);
		
		cityField = new JTextField();
		cityField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cityField.setHorizontalAlignment(SwingConstants.CENTER);
		cityField.setBackground(Color.LIGHT_GRAY);
		cityField.setBounds(293, 188, 131, 20);
		frame.getContentPane().add(cityField);
		cityField.setColumns(10);
		
		btnDone.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cnp = cnpField.getText();
				String born = "";
				String year = "";
				
				if (cnp.length() == 13) {
					genderField.setText("masculin");
					if (Character.toString(cnp.charAt(0)).equals("1") || Character.toString(cnp.charAt(0)).equals("3") || Character.toString(cnp.charAt(0)).equals("5") || Character.toString(cnp.charAt(0)).equals("7") ) {
						genderField.setText("masculin");
						
					}
					else if (Character.toString(cnp.charAt(0)).equals("2") || Character.toString(cnp.charAt(0)).equals("4") || Character.toString(cnp.charAt(0)).equals("6") || Character.toString(cnp.charAt(0)).equals("8")) {
						genderField.setText("feminin");;
					}
					
					if (Character.toString(cnp.charAt(0)).equals("5") || Character.toString(cnp.charAt(0)).equals("6")) {
						year = 20 + Character.toString(cnp.charAt(1)) + Character.toString(cnp.charAt(2));
					}
					else if (Character.toString(cnp.charAt(0)).equals("1") || Character.toString(cnp.charAt(0)).equals("2") || Character.toString(cnp.charAt(0)).equals("7") || Character.toString(cnp.charAt(0)).equals("8")) {
						year = 19 + Character.toString(cnp.charAt(1)) + Character.toString(cnp.charAt(2)); 
					}
					else if (Character.toString(cnp.charAt(0)).equals("3") || Character.toString(cnp.charAt(0)).equals("4")) {
						year = 18 + Character.toString(cnp.charAt(1)) + Character.toString(cnp.charAt(2));
					}
					
					born = Character.toString(cnp.charAt(5)) + Character.toString(cnp.charAt(6)) + "." + Character.toString(cnp.charAt(3)) + Character.toString(cnp.charAt(4)) + "." + year;
					bornField.setText(born);
					int finalYear = Integer.parseInt(year);
					
					int age = 2022 - finalYear;
					String ageString = Integer.toString(age);
					ageField.setText(ageString);
					
					HashMap<String, String> city = new HashMap<>();
					city.put("01", "Alba");	city.put("02", "Arad");city.put("03", "Arges");city.put("04", "Bacau");city.put("05", "Bihor");city.put("06", "Bistrita-Nasaud");city.put("07", "Botosani");
					city.put("08", "Brasov");city.put("09", "Braila");city.put("10", "Buzau");city.put("11", "Caras-Severin");city.put("12", "Cluj");city.put("13", "Constanta");
					city.put("14", "Covasna");city.put("15", "Dambovita");city.put("16", "Dolj");city.put("17", "Galati");city.put("18", "Gorj");city.put("19", "Harghita");
					city.put("20", "Hunedoara");city.put("21", "Ialomita");city.put("22", "Iasi");city.put("23", "Ilfov");city.put("24", "Maramues");city.put("25", "Mehedinti");city.put("26", "Mures");
					city.put("27", "Neamt");city.put("28", "Olt");city.put("29", "Prahova");city.put("30", "Satu Mare");city.put("31", "Salaj");city.put("32", "Sibiu");
					city.put("33", "Suceava");city.put("34", "Teleorman");city.put("35", "Timis");city.put("36", "Tulcea");city.put("37", "Vaslui");city.put("38", "Valcea");
					city.put("39", "Vrancea");city.put("40", "Bucuresti");city.put("41", "Bucuresti - Sector 1");city.put("42", "Bucuresti - Sector 2");city.put("43", "Bucuresti - Sector 3");
					city.put("44", "Bucuresti - Sector 4");city.put("45", "Bucuresti - Sector 5");city.put("46", "Bucuresti - Sector 6");city.put("51", "Calarasi");city.put("52", "Giurgiu");
					city.put("47", "Bucuresti - Sector 7");city.put("48", "Bucuresti - Sector 8");
					
					String bornCity = Character.toString(cnp.charAt(7)) + Character.toString(cnp.charAt(8));
					
					cityField.setText(city.get(bornCity));
					
					int checkCity = Integer.parseInt(bornCity);
					if (checkCity < 1 || checkCity > 48) {
						cityField.setText("error");
					}
				
				}
				else if (cnp.length() != 13){
					JOptionPane.showMessageDialog(null, "Introduceti un CNP corect!", "Error", 0, null);
				}
			}
			
		});
	}
}
