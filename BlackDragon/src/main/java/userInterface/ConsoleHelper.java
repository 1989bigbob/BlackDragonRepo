package userInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
	BufferedReader reader;
	
	public ConsoleHelper(){
		this.reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String read(){
		String result = "";
		try{
			result = this.reader.readLine();
		} catch (IOException ex){
			ex.printStackTrace();
			System.exit(1);
		}
		
		return result;
	}
	
	public String read(String text){
		String result = "";
		
		System.out.print(text + " ");
		
		result = this.read();
		
		return result;
	}
	
	public void write(String text){
		System.out.println(text);
	}

}
