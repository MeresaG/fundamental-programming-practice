package lesson6.project.one;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddressForm extends JFrame{
	
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel bottomPanel;
	
	private JPanel namePanel, streetPanel, cityPanel, statePanel, zipPanel;
	
	private JTextField name, street, city, state, zip;
	private JLabel lName, lStreet, lCity, lState, lZip;
	private JButton submit;
	
	public AddressForm() {
		
		initializeWindow();
		
		JPanel mainPanel = new JPanel();
		
		defineTopPanel();
		defineMiddlePanel();
		defineBottomPanel();
		
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		
		getContentPane().add(mainPanel);
		
		
	}
	
	private void defineTopPanel() {
		
		topPanel = new JPanel();
		defineNamePanel();
		defineStreetPanel();
		defineCityPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(namePanel, BorderLayout.WEST);
		topPanel.add(streetPanel, BorderLayout.CENTER);	
		topPanel.add(cityPanel, BorderLayout.EAST);
		
		
		
	}
	
	private void defineNamePanel() {
		
		namePanel = new JPanel();
		namePanel.setLayout(new BorderLayout());
		
		name = new JTextField(10);
		lName = new JLabel("Name");
		
		namePanel.add(name, BorderLayout.CENTER);
		namePanel.add(lName, BorderLayout.NORTH);
		
	}
	
	private void defineStreetPanel() {
		

		streetPanel = new JPanel();
		streetPanel.setLayout(new BorderLayout());
		
		street = new JTextField(10);
		lStreet = new JLabel("Street");
		
		streetPanel.add(street, BorderLayout.CENTER);
		streetPanel.add(lStreet, BorderLayout.NORTH);
		
	}
	
	private void defineCityPanel() {
		

		cityPanel = new JPanel();
		cityPanel.setLayout(new BorderLayout());
		
		city = new JTextField(10);
		lCity = new JLabel("City");
		
		cityPanel.add(lCity, BorderLayout.NORTH);
		cityPanel.add(city, BorderLayout.CENTER);
		
		
	}
	
	private void defineStatePanel() {
			
	
			statePanel = new JPanel();
			statePanel.setLayout(new BorderLayout());
			
			state = new JTextField(10);
			lState = new JLabel("State");
			
			statePanel.add(lState, BorderLayout.NORTH);
			statePanel.add(state, BorderLayout.CENTER);
			
			
		}

	private void defineZipPanel() {
		
	
		zipPanel = new JPanel();
		zipPanel.setLayout(new BorderLayout());
		
		zip = new JTextField(10);
		lZip = new JLabel("Zip");
		
		zipPanel.add(lZip, BorderLayout.NORTH);
		zipPanel.add(zip, BorderLayout.CENTER);
		
		
	}
	
	private void defineMiddlePanel() {
		
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		defineStatePanel();
		defineZipPanel();
		
		middlePanel.add(statePanel, BorderLayout.CENTER);	
		middlePanel.add(zipPanel, BorderLayout.EAST);
		
	}
	
	private void defineBottomPanel() {
		
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		submit = new JButton("Submit");
		
		submit.addActionListener(new ButtonListner());
		//submit.setPreferredSize(new Dimension(40, 40));
		bottomPanel.add(submit, BorderLayout.CENTER);
		
		
	}
	
	private void initializeWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String Utility");
		setSize(400, 300);
		handleWindowClosing();
		centerFrameOnDesktop(this);
		setResizable(false);
			
	}
	
	private void handleWindowClosing() {
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
				//other clean-up
                System.exit(0);
           }
        }); 				
	}
	
	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}
	
	public static void centerFrameOnDesktop(Component f) {
		
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		int height = dimension.height;
		int width = dimension.width;
		
		int frameHeight = f.getHeight();
		int frameWidth = f.getWidth();
		f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/2); 
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				AddressForm addressForm = new AddressForm();
				addressForm.setVisible(true);
			}
		});
	}
	
	class ButtonListner implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			
			System.out.println(name.getText());
			System.out.println(street.getText());
			System.out.println(city.getText() + ", " + state.getText() + " " + zip.getText());
			
		}
		
	}

}
