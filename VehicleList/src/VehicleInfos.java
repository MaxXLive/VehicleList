import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VehicleInfos {

	private JFrame frame;
	/**
	 * Create the application.
	 */
	public VehicleInfos(Vehicle veh) {
		initialize(veh);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Vehicle veh) {
		frame = new JFrame(veh.getInfos());
		frame.setType(Type.UTILITY);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 250, 380);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		Image image = null;
        try {
            URL url = new URL(veh.getImgurl());
            image = ImageIO.read(url);
            JLabel ImageLabel = new JLabel(new ImageIcon(image.getScaledInstance(224, 168, Image.SCALE_SMOOTH)));
    		ImageLabel.setBounds(10, 11, 224, 168);
    		frame.getContentPane().add(ImageLabel);
        } catch (IOException e) {
        	System.out.println("No Image found");;
        }
		
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setText
		(
			"Color: " + veh.getColor() + "\n" +
			"Power: " + veh.getkW() + " kw / " + veh.getHP() + " HP\n" +
			"Capacity: " + veh.getCcm() + " ccm³\n" +
			"Milage: " + veh.getKilometers() + " km (" + veh.getCondition() + ")\n" +
			"Price: " + veh.getPrice() + " €"
			
		);
		textArea.setEditable(false);
		textArea.setBounds(10, 190, 224, 105);
		frame.getContentPane().add(textArea);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(veh.getShopurl().contains("http"))
				{
					try {
				        Desktop.getDesktop().browse(new URL(veh.getShopurl()).toURI());
				    } catch (Exception ex) {
				        ex.printStackTrace();
				    }
				}
			}
		});
		btnBuy.setBounds(10, 317, 110, 23);
		frame.getContentPane().add(btnBuy);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
			}
		});
		btnClose.setBounds(124, 317, 110, 23);
		frame.getContentPane().add(btnClose);
	}
}
