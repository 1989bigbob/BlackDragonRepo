package Map;

public class Forest implements Terrain {
	
	public Forest(){
		
	}

	@Override
	public String arrive() {
		StringBuilder builder = new StringBuilder();
		builder.append("You arrive in a dark forest.");
		builder.append(System.getProperty("line.separator"));
		builder.append("Pines are looking down grim on you. Somewhere birds are chirping but few light is coming down to the soft ground where you stand.");
				
		return builder.toString();
	}

	@Override
	public String lookAround() {
		StringBuilder builder = new StringBuilder();
		builder.append("A danger is lurking in the darkness.");
		builder.append(System.getProperty("line.separator"));
		builder.append("Due to the twilight you can barely see anything, but the danger has yet to come out to challenge you.");
		
		return builder.toString();
	}

}
