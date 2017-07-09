import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addVehicle {

	private JFrame frmAddVehicle;
	private JTextField textbrand;
	private JLabel lblModel;
	private JTextField textmodel;
	private JLabel lblYear;
	private JTextField textpower;
	private JLabel lblPowerInKw;
	private JTextField textccm;
	private JTextField textyear;
	private JLabel lblYear_1;
	private JTextField textkm;
	private JTextField textprice;
	private JLabel label;
	private JLabel label_1;
	private JTextField textshop;
	private JLabel lblShopUrl;
	private JTextField textimg;
	private JLabel lblImageUrl;
	private JButton btnSave;
	private JButton btnCancel;
	
	public Vehicle veh = new Vehicle();

	/**
	 * Create the application.
	 */
	public addVehicle(int newid) {
		initialize(newid);
		frmAddVehicle.setVisible(true);
	}
	
	static void InfoMsgBox(String title, String text)
	{
		JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize(int newid) {
		frmAddVehicle = new JFrame();
		frmAddVehicle.setTitle("Add Vehicle");
		frmAddVehicle.setBounds(100, 100, 244, 413);
		frmAddVehicle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAddVehicle.getContentPane().setLayout(null);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(10, 11, 220, 14);
		frmAddVehicle.getContentPane().add(lblBrand);
		
		textbrand = new JTextField();
		textbrand.setBounds(10, 28, 220, 20);
		frmAddVehicle.getContentPane().add(textbrand);
		textbrand.setColumns(10);
		
		lblModel = new JLabel("Model");
		lblModel.setBounds(125, 59, 103, 14);
		frmAddVehicle.getContentPane().add(lblModel);
		
		textmodel = new JTextField();
		textmodel.setColumns(10);
		textmodel.setBounds(125, 76, 105, 20);
		frmAddVehicle.getContentPane().add(textmodel);
		
		lblYear = new JLabel("Power (in kW)");
		lblYear.setBounds(10, 107, 105, 14);
		frmAddVehicle.getContentPane().add(lblYear);
		
		textpower = new JTextField();
		textpower.setColumns(10);
		textpower.setBounds(10, 124, 105, 20);
		frmAddVehicle.getContentPane().add(textpower);
		
		lblPowerInKw = new JLabel("Capacity (in ccm\u00B3)");
		lblPowerInKw.setBounds(125, 107, 105, 14);
		frmAddVehicle.getContentPane().add(lblPowerInKw);
		
		textccm = new JTextField();
		textccm.setColumns(10);
		textccm.setBounds(125, 124, 105, 20);
		frmAddVehicle.getContentPane().add(textccm);
		
		textyear = new JTextField();
		textyear.setColumns(10);
		textyear.setBounds(10, 76, 105, 20);
		frmAddVehicle.getContentPane().add(textyear);
		
		lblYear_1 = new JLabel("Year");
		lblYear_1.setBounds(10, 59, 105, 14);
		frmAddVehicle.getContentPane().add(lblYear_1);
		
		JComboBox comboBoxfuel = new JComboBox();
		comboBoxfuel.setForeground(Color.BLACK);
		comboBoxfuel.setModel(new DefaultComboBoxModel(new String[] {"Gasoline", "Diesel", "Electro"}));
		comboBoxfuel.setBounds(125, 220, 105, 20);
		frmAddVehicle.getContentPane().add(comboBoxfuel);
		
		JComboBox comboBoxcolor = new JComboBox();
		comboBoxcolor.setModel(new DefaultComboBoxModel(new String[] {"BLACK", "BLUE", "CYAN", "DARKGRAY", "GRAY", "GREEN", "LIGHTGRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW"}));
		comboBoxcolor.setForeground(Color.BLACK);
		comboBoxcolor.setBounds(10, 220, 105, 20);
		frmAddVehicle.getContentPane().add(comboBoxcolor);
		
		textkm = new JTextField();
		textkm.setColumns(10);
		textkm.setBounds(10, 172, 105, 20);
		frmAddVehicle.getContentPane().add(textkm);
		
		JLabel lblMilageInKm = new JLabel("Milage (in km)");
		lblMilageInKm.setBounds(10, 155, 105, 14);
		frmAddVehicle.getContentPane().add(lblMilageInKm);
		
		textprice = new JTextField();
		textprice.setColumns(10);
		textprice.setBounds(125, 172, 105, 20);
		frmAddVehicle.getContentPane().add(textprice);
		
		JLabel lblPriceinEur = new JLabel("Price (in EUR)");
		lblPriceinEur.setBounds(125, 155, 105, 14);
		frmAddVehicle.getContentPane().add(lblPriceinEur);
		
		label = new JLabel("Color");
		label.setBounds(10, 203, 105, 14);
		frmAddVehicle.getContentPane().add(label);
		
		label_1 = new JLabel("Fueltype");
		label_1.setBounds(125, 203, 105, 14);
		frmAddVehicle.getContentPane().add(label_1);
		
		textshop = new JTextField();
		textshop.setColumns(10);
		textshop.setBounds(10, 268, 220, 20);
		frmAddVehicle.getContentPane().add(textshop);
		
		lblShopUrl = new JLabel("Shop URL");
		lblShopUrl.setBounds(10, 251, 220, 14);
		frmAddVehicle.getContentPane().add(lblShopUrl);
		
		textimg = new JTextField();
		textimg.setColumns(10);
		textimg.setBounds(10, 316, 220, 20);
		frmAddVehicle.getContentPane().add(textimg);
		
		lblImageUrl = new JLabel("Image URL");
		lblImageUrl.setBounds(10, 299, 220, 14);
		frmAddVehicle.getContentPane().add(lblImageUrl);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				veh.setBrand(textbrand.getText());
				veh.setModel(textmodel.getText());
				
				try{
					int year = Integer.parseInt(textyear.getText());
					veh.setYear(year);
				}catch(Exception ex)
				{
					textyear.setText("");
				}
				
				veh.setColor(comboBoxcolor.getSelectedItem().toString());
				veh.setFueltype(comboBoxfuel.getSelectedItem().toString());
				
				try{
					int kW = Integer.parseInt(textpower.getText());
					veh.setkW(kW);
				}catch(Exception ex)
				{
					textpower.setText("");
				}
				
				try{
					int ccm = Integer.parseInt(textccm.getText());
					veh.setCcm(ccm);
				}catch(Exception ex)
				{
					textccm.setText("");
				}
				
				try{
					int km = Integer.parseInt(textkm.getText());
					veh.setKilometers(km);
				}catch(Exception ex)
				{
					textkm.setText("");
				}
				
				try{
					double price = Double.parseDouble(textprice.getText());
					veh.setPrice(price);
				}catch(Exception ex)
				{
					textprice.setText("");
				}
				
				veh.setImgurl(textimg.getText());
				veh.setShopurl(textshop.getText());
				
				
				veh.setId(newid);
				
				FileMgr.write(veh, VehicleList.path, String.valueOf(veh.getId()));
				frmAddVehicle.dispose();
			}
		});
		btnSave.setBounds(10, 347, 105, 23);
		frmAddVehicle.getContentPane().add(btnSave);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddVehicle.dispose();
			}
		});
		btnCancel.setBounds(125, 347, 105, 23);
		frmAddVehicle.getContentPane().add(btnCancel);
		frmAddVehicle.setResizable(false);
	}
}
