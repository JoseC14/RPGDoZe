package entities;

public class Job {
	private String name;
	private Integer attack;
	private Integer protection;
	private Integer hpPlusPoints;
	private Integer ManaPlusPoints;
	
	
	
	public Job(String name, Integer attack, Integer protection, Integer hpPlusPoints, Integer manaPlusPoints) {
		this.name = name;
		this.attack = attack;
		this.protection = protection;
		this.hpPlusPoints = hpPlusPoints;
		this.ManaPlusPoints = manaPlusPoints;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getProtection() {
		return protection;
	}
	public void setProtection(Integer protection) {
		this.protection = protection;
	}
	public Integer getHpPlusPoints() {
		return hpPlusPoints;
	}
	public void setHpPlusPoints(Integer hpPlusPoints) {
		this.hpPlusPoints = hpPlusPoints;
	}
	public Integer getManaPlusPoints() {
		return ManaPlusPoints;
	}
	public void setManaPlusPoints(Integer manaPlusPoints) {
		ManaPlusPoints = manaPlusPoints;
	}
	
	
}
