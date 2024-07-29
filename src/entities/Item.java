package entities;
import java.util.Random;

public class Item {
	private String name;
	private String type;
	private Integer points;
	
	public Item(String name, String type, Integer points)
	{
		Random rand = new Random();
		this.name = name;
		this.type = type;
		this.points = rand.nextInt(7) * 3;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Integer getPoints() {
		return points;
	}


	public void setPoints(Integer points) {
		this.points = points;
	}

	
	
	
}
