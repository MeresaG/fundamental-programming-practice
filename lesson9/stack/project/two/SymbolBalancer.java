package lesson9.stack.project.two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
	Stack<Character> stack;
	Map<Character, Character> delimeterMatch;
	
	public SymbolBalancer(String filename) {
		this.filename = filename;
		stack = new Stack<Character>();
		delimeterMatch = new HashMap<Character, Character>();;
		setUpDelimeters();
		readFile();
	}

	public String getText() {
		return text;
	}
	
	private void setUpDelimeters() {
		
		delimeterMatch.put('(', ')');
		delimeterMatch.put('{', '}');
		delimeterMatch.put('[', ']');
		delimeterMatch.put('|', '|');
		delimeterMatch.put('<', '>');
		
		
		
	}
	
	String getDelimeters(String textInput) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < textInput.length(); i++) {
			
			
			if(delimeterMatch.containsKey(textInput.charAt(i)) || delimeterMatch.containsValue(textInput.charAt(i))) {
				
				sb.append(textInput.charAt(i));
			}
			
		}
		
		return sb.toString();
		
	}

	boolean symbolsBalanced(String delimiters) {
		for(int i = 0 ; i < delimiters.length(); i ++) {
		
			if(delimeterMatch.containsKey(delimiters.charAt(i))) {
				stack.push(delimiters.charAt(i));
				
			}
			
			if(delimeterMatch.containsValue(delimiters.charAt(i))) {
				
				if(stack.empty())
					return false;
				if(delimeterMatch.get(stack.peek()) == delimiters.charAt(i)) {
					
					stack.pop();
					
				}
				
			}
			
			
		}
		return stack.empty() == true;

	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("Employee.java");
		String delimeter =  sb.getDelimeters(sb.getText());
		//System.out.println("delimeters..." + delimeter);
		System.out.println(sb.symbolsBalanced(delimeter));
	}

	void readFile() {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			//System.out.println(text);
			sc.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}

}
