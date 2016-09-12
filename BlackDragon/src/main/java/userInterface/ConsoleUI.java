package userInterface;

import game.GameInterface;
import game.GameMediator;

public class ConsoleUI {
	private ConsoleHelper conHel;
	private GameInterface game;
	
	private final String SHOW_INPUT_OPTIONS = "S";
	private final String SHOW_ENEMY = "SEn";
	private final String SHOW_SKILLS = "Sk";
	private final String CHOOSE_SKILLS = "CSk";
	private final String DELETE_SKILLS = "DSk";
	private final String END_TURN = "E";
	private final String QUIT = "Q";
	
	/**
	 * Führt Initialisierungen durch um Ausgaben und Eingaben auf der Konsole handhaben zu können.
	 * @param game Ist das Objekt, welches die Schnittstelle zur eigentlichen Spiel-Logik realisiert
	 */
	public ConsoleUI(GameInterface game){
		conHel = new ConsoleHelper();
		this.game = game;
	}
	
	/**
	 * Startet das Spiel.
	 * 
	 * Unter anderem wird eine Willkommensnachricht ausgegeben sowie anschließend auf Kommandos gewartet und diese verarbeitet.
	 */
	public void startGame(){
		this.showWelcome();		
	}
	
	private void showWelcome(){
		conHel.write("Welcome to BlackDragon RPG!");
		conHel.write("Type 'S' to show the input options and press Enter");
		this.parseInput();
	}
	
	private void showPossibleInputs(){
		conHel.write("Input Options: ");
		conHel.write("'" + this.SHOW_INPUT_OPTIONS + "' Show input options");
		conHel.write("'" + this.SHOW_ENEMY + "' Show enemy");
		conHel.write("'" + this.SHOW_SKILLS + "' show Skills");
		conHel.write("'" + this.CHOOSE_SKILLS + "' Choose Skills");
		conHel.write("'" + this.DELETE_SKILLS + "' Delete chosen Skills");
		conHel.write("'" + this.END_TURN + "' End turn");
		conHel.write("'" + this.QUIT + "' Quit game");
		this.parseInput();
	}
	
	private void inputNotUnderstood(){
		conHel.write("Your input wasn't understood.");
		conHel.write("Type 'S' to show the input options and press Enter");
		this.parseInput();
	}
	
	private void showBattlefield(){
		
	}
	
	private void parseInput(){
		String command = conHel.read("Command: ");
		
		switch (command){
			case SHOW_INPUT_OPTIONS:
				this.showPossibleInputs();
				break;
			case QUIT:
				this.quit();
				break;
			default:
				this.inputNotUnderstood();
				break;
		}
		
		// if code reaches beyond this switch, the game ends
	}
	
	private void showActionPoints(){
		
	}
	
	private void showSkills(){
		
	}
	
	private void chooseSkills(String skill, int actionPoint){
		
	}
	
	private void deleteSkill(String skill, int actionPoint){
		
	}
	
	private void endTurn(){
		// show enemy actions
		this.showBattlefield();
	}
	
	private void quit(){
		conHel.write("Quitting game. Bye!");
	}

}
