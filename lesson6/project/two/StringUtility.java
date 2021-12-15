package lesson6.project.two;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

public class StringUtility extends JFrame{
	
	private JPanel leftPanel;
	private JPanel rightPanel;
	private JPanel inputTextPanel, outputTextPanel;
	private JTextField input, output;
	private JLabel labelInput, labelOutput;
	private JButton countLetters, reverseLetters, removeLetters;
	
	public StringUtility() {
		
		initializeWindow();
		
		JPanel mainPanel = new JPanel();
		
		defineLeftPanel();
		defineRightPanel();
		
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		mainPanel.add(leftPanel, BorderLayout.WEST);
		mainPanel.add(rightPanel, BorderLayout.EAST);
		getContentPane().add(mainPanel);
				
		
	}
	
	private void defineRightPanel() {
		rightPanel = new JPanel();
		defineInputTextPanel();
		defineOutputTextPanel();
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(inputTextPanel, BorderLayout.NORTH);
		rightPanel.add(outputTextPanel, BorderLayout.CENTER);	

	}
	
	private void defineInputTextPanel() {

		input = new JTextField(15);
		labelInput = new JLabel("Input");		
		labelInput.setFont(makeSmallFont(labelInput.getFont()));

		inputTextPanel = new JPanel();
		inputTextPanel.setLayout(new BorderLayout());
		inputTextPanel.add(labelInput, BorderLayout.NORTH);
		inputTextPanel.add(input, BorderLayout.CENTER);
	
	}
	
	private void defineOutputTextPanel() {

		output = new JTextField(15);
		labelOutput = new JLabel("Output");
		labelOutput.setFont(makeSmallFont(labelInput.getFont()));
		
		outputTextPanel = new JPanel();
		outputTextPanel.setLayout(new BorderLayout());
		outputTextPanel.add(labelOutput, BorderLayout.NORTH);
		outputTextPanel.add(output, BorderLayout.CENTER);
	
	}
	
	private void defineLeftPanel() {
		leftPanel = new JPanel();
		leftPanel.setLayout(new BorderLayout());
		
		countLetters = new JButton("Count Letters");
		reverseLetters = new JButton("Reverse Letters");
		removeLetters = new JButton("Remove Letters");
		
		countLetters.addActionListener(new ButtonListener());
		reverseLetters.addActionListener(new ButtonListener());
		removeLetters.addActionListener(new ButtonListener());
		
		leftPanel.add(countLetters, BorderLayout.NORTH);
		leftPanel.add(reverseLetters, BorderLayout.CENTER);
		leftPanel.add(removeLetters, BorderLayout.SOUTH);

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
				StringUtility stringUtility = new StringUtility();
				stringUtility.setVisible(true);
			}
		});
	}
	
	
	class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			
			String textVal = input.getText();
			final String prompt = "Type a string";
			
			if (textVal.equals("")) {

				input.setText(prompt);
			} 
			
			else {
				if (evt.getSource() == countLetters) {
					
					output.setText(Integer.toString(textVal.length()));
					
				}
				
				else if(evt.getSource() == reverseLetters) {
					
					StringBuilder sb = new StringBuilder();
					for(int i = textVal.length() - 1 ; i >= 0 ; i--) {
						sb.append(textVal.charAt(i));
					
					}
					
					output.setText(sb.toString());
					
				}
				
				else if (evt.getSource() == removeLetters) {
					
					StringBuilder sb = new StringBuilder();
					
					for(int i = 0; i < textVal.length(); i++) {
						
						if(!(sb.toString().contains(Character.toString(textVal.charAt(i))))) {
							
							sb.append(textVal.charAt(i));
							
						}
					}
					
					output.setText(sb.toString());
					
				}
				
			}
			
		}
	}
	
	/*
	class ReverseLettersListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			
			String textVal = input.getText();
			StringBuilder sb = new StringBuilder();
			
			if( !(textVal.isEmpty())) {
			
				for(int i = textVal.length() - 1 ; i >= 0 ; i--) {
				sb.append(textVal.charAt(i));
			}
				
				output.setText(sb.toString());
			
			}
			
		}
	}
	
	class RemoveLettersListener implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
		
			String textVal = input.getText();
			final String prompt = "Type a string";
			
			if (textVal.equals("")) {

				input.setText(prompt);
			} 
			
			else {
				
				StringBuilder sb = new StringBuilder();
				
				for(int i = 0; i < textVal.length(); i++) {
					
					if(!(sb.toString().contains(Character.toString(textVal.charAt(i))))) {
						
						sb.append(textVal.charAt(i));
						
					}
				}
				output.setText(sb.toString());
			}
			
		}
		
	}*/

}
