package lesson.seven.project.one;

public class MyTable {
	
	Entry[] entries = new Entry[26];
	
	public void add(char c, String s){
		
		int pos = findPosition(c);
		if(pos != -1) {
			entries[pos] = new Entry(c, s);
		}
		
	}
	
	public int findPosition(char c) {
		
		return c - 'a';
		
	}
	
	public String get(char c){
		
		int pos = findPosition(c);
		
		if(pos != -1) {
			
			return entries[pos].s;
			
		}
		
		return null;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < entries.length; i++ ) {
			
			if( entries[i] != null) {
				sb.append(entries[i].toString() + "\n");
			}
			
		}
		
		return sb.toString();
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t.get('b'));
		System.out.println(t);
		
	}
	class Entry {
		
		char c;
		String s;
		
		public Entry(char c, String s) {
			
			this.c = c;
			this.s = s;
			
		}

		public String toString() {
			
			return c + "->" + s;
			
		}
		
		
	}
	
}