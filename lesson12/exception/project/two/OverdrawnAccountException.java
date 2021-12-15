package lesson12.exception.project.two;


public class OverdrawnAccountException extends Exception {

	public OverdrawnAccountException() {
		super();
	}
	public OverdrawnAccountException(String msg) {
		super("OverdrawnAccountException thrown: "+ msg);
	}
	

}