package lesson12.exception.project.one;

public class IllegalClosedCurveException extends Exception{
	
	public IllegalClosedCurveException() {
		super();
	}
	
	public IllegalClosedCurveException(String msg) {
		super(msg);
		
	}
	
	public IllegalClosedCurveException(Throwable t) {
		super(t);
	}

}
