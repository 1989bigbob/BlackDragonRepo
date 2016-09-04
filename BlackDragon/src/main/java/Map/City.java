package Map;

public class City implements Terrain {
	
	public City(){
	}

	@Override
	public String arrive() {
		StringBuilder builder = new StringBuilder();
		builder.append("You arrive at a beautiful city.");
		builder.append(System.getProperty("line.separator"));
		builder.append("The huge gate is decorate with pictures of men fighting beasts. The guardings check you, before you are allowed to go in.");
				
		return builder.toString();
	}

	@Override
	public String lookAround() {
		StringBuilder builder = new StringBuilder();
		builder.append("Everything is peaceful.");
		builder.append(System.getProperty("line.separator"));
		builder.append("Somewhere a smith is smashing down on his newest weapon, peasants are bringing crops and traders praise their goods.");
		
		return builder.toString();
	}

}
