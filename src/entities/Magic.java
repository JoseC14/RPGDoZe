package entities;

public class Magic {
	private String name;
	private String type;
	private Integer attack;
	private Integer manaCost;
	
	public Magic(String name, String type, Integer attack, Integer manaCost) {
		this.name = name;
		this.type = type;
		this.attack = attack;
		this.manaCost = manaCost;
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
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getManaCost() {
		return manaCost;
	}
	public void setManaCost(Integer manaCost) {
		this.manaCost = manaCost;
	}

	
	
}
