import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frmVehicleList;

	/**
	 * Create the application.
	 */
	public Window(Vehicle[] vehs, int length) {
		initialize(vehs, length);
		frmVehicleList.setVisible(true);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Vehicle[] vehs, int length) {
		frmVehicleList = new JFrame();
		frmVehicleList.setTitle("Vehicle List");
		frmVehicleList.setBounds(100, 100, 413, 500);
		frmVehicleList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVehicleList.getContentPane().setLayout(null);
		frmVehicleList.setResizable(false);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(109, 427, 89, 23);
		frmVehicleList.getContentPane().add(btnAdd);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		btnExit.setBounds(307, 427, 89, 23);
		frmVehicleList.getContentPane().add(btnExit);
		
		
		for(int i = 0; i < length; i++)
		{
			try {
				model.addElement(String.valueOf(vehs[i].getInfos()));
			}
			catch (Exception e)
			{
				
			}
			
		}

		JList<String> list = new JList<String>(model);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(212, 226, 1, 1);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 10, 386, 406);
		frmVehicleList.getContentPane().add(scrollPane);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if(!list.isSelectionEmpty())
				{
					System.out.println(list.getSelectedIndex());
					new VehicleInfos(vehs[list.getSelectedIndex()]);
				}
				
			}
		});
		
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int newid = 0;
				for(int i = 0; i < vehs.length; i++)
				{
					if(vehs[i].getId() > newid)
					{
						newid = vehs[i].getId();
					}
				}
				
				new addVehicle(newid + 1);
			}
		});
		
		btnOpen.setBounds(10, 427, 89, 23);
		frmVehicleList.getContentPane().add(btnOpen);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVehicleList.dispose();
				VehicleList.main(null);
			}
		});
		btnRefresh.setBounds(208, 427, 89, 23);
		frmVehicleList.getContentPane().add(btnRefresh);
		
	}
}
