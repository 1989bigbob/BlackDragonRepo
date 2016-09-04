package Character;

import Main.ConsoleHelper;
import Main.MainFactory;
import Map.City;
import Map.Terrain;

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
