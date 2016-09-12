package main;

import character.Player;
import game.GameMediator;
import map.Forest;
import userInterface.ConsoleHelper;
import userInterface.ConsoleUI;

public class Main {

	public static void main(String[] args) {
		ConsoleUI ui = new ConsoleUI(new GameMediator());
		ui.startGame();
	}
	
	/**
	 * @deprecated
	 */
	public static void oldMain(){
		ConsoleHelper conHel = MainFactory.getConsoleHelper();
		
		conHel.write("Hello World!");

		Player player = new Player();
		parse(player);
	}
	
	/**
	 * @deprecated
	 * @param player Das Player-Objekt mit welchem die Nutzer-Eingaben durchgeführt werden sollen
	 */
	public static void parse(Player player){
		ConsoleHelper conHel = MainFactory.getConsoleHelper();
		String input = conHel.read("What do you want to do?");
		if(input.equals("Fight")) player.fight();
		else if(input.equals("Move")) player.moveTo(new Forest());
		else if(input.equals("Quit")) System.exit(0);
		
		parse(player);
	}

}
