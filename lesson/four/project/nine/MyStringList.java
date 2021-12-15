package lesson.four.project.nine;

import java.util.Arrays;

public class MyStringList {
	
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		
		if ((strArray.length) == size) {
			
			resize();
			
		}
		
		strArray[size] = s;
		size++;
		
	}
	
	public String get(int i){
		
		if ( (size) > i && i >= 0){
			
			return strArray[i];
		}
		
		return null;
	}
	
	public boolean find(String s){
		
		for (String c : strArray) {
			
			if(s.equals(c)) {
				
				return true;

			}
			
		}
		
		return false;
	}
	
	public void insert(String s, int pos){
		
		int maxCounter = size;
		
		
		if (size >= pos && pos >= 0) {
			
			if ((strArray.length - 1) < size) {
				
				resize();
				
			}
			
			for(int i = size - 1; i >= pos; i--) {
				
				strArray[i + 1] = strArray[i];				
							
				
			}
			strArray[pos] = s;
			
			size++;
			
		}
		
	}
	
	public boolean remove(String s){
		
		int pos = -1;
		boolean status = false;
		int maxCounter = size;
		
		for (int i = 0 ; i < maxCounter; i++) {
			
			if(strArray[i].equals(s) && pos == -1) {
				
				pos = i;
				strArray[i] = strArray[i+1];
				status = true;
				size--;
				
			}
			
			else if(pos != -1) {
				
				strArray[i] = strArray[i+1];
			}
			
		}
		
		
		
		return status;
	}
	
	
	private void resize(){
		
		System.out.println("Resizing...");
		int arrayLength =  strArray.length * INITIAL_LENGTH;
		String[] newArray = new String[arrayLength];
		System.arraycopy(strArray, 0, newArray, 0, strArray.length);
		
		strArray = newArray;
			
		
		
	}
	public String toString(){
		
		String[] newArray = new String[size];
		for(int i = 0 ; i < newArray.length; i++) {
			if (strArray[i] != null) {
				newArray[i] = strArray[i];
			}
			
		}
		return Arrays.toString(newArray);
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		
		l.remove("Mark");
		System.out.println("The list of size "+l.size()+" is "+l);
		
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
		
		System.out.println(l.get(3));
		
	}

}