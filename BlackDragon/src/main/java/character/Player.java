package character;

import main.MainFactory;
import map.City;
import map.Terrain;
import userInterface.ConsoleHelper;

public class Player {
	ConsoleHelper conHel;
	Terrain terrain;
	
	public Player(){
		this.conHel = MainFactory.getConsoleHelper();
		this.moveTo(new City());
	}
	
	public void moveTo(Terrain ter){
		this.terrain = ter;
		conHel.write(this.terrain.arrive());
	}
	
	public void fight(){
		conHel.write("Nothing to fight. " + this.terrain.lookAround());
	}
}
