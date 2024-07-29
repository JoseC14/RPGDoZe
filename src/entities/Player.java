package entities;



public class Player extends Person{

	public Player(String name, Integer hpPoints, Integer manaPoints, Job job) {
		super(name, hpPoints, manaPoints, job);
	}
	
	public String talk()
	{
		return "Olá";
	}
	
	public void useItem(Item item)
	{
		if(item.getType() == "attack")
		{
			job.setAttack(job.getAttack() + item.getPoints());
		}
		else if(item.getType() == "defence")
		{
			job.setProtection(job.getProtection() + item.getPoints());
		}
		else if(item.getType() == "healing")
		{
			hpPoints += item.getPoints();
		}
	}
}
