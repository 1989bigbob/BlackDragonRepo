package Main;

import Character.Player;
import Map.Forest;

public class Main {

	public static void main(String[] args) {
		ConsoleHelper conHel = MainFactory.getConsoleHelper();
		
		conHel.write("Hello World!");

		Player player = new Player();
		parse(player);
		
	}
	
	public static void parse(Player player){
		ConsoleHelper conHel = MainFactory.getConsoleHelper();
		String input = conHel.read("What do you want to do?");
		if(input.equals("Fight")) player.fight();
		else if(input.equals("Move")) player.moveTo(new Forest());
		else if(input.equals("Quit")) System.exit(0);
		
		parse(player);
	}

}
