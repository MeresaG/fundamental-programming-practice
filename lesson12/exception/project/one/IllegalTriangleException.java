package lesson12.exception.project.one;

public class IllegalTriangleException extends Exception {
	
	public IllegalTriangleException() {
		super();
	}
	
	public IllegalTriangleException(String msg) {
		super(msg);
		
	}
	
	public IllegalTriangleException(Throwable t) {
		super(t);
	}

}
