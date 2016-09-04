package Main;

public class MainFactory {
	private static ConsoleHelper conHel = new ConsoleHelper();
	
	public static ConsoleHelper getConsoleHelper(){
		return conHel;
	}
}
