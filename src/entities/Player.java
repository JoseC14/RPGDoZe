package entities;



public class Player extends Person{

	public Player(String name, Integer hpPoints, Integer manaPoints, Integer attack, Integer defence) {
		super(name, hpPoints, manaPoints, attack, defence);
	}
	
	public String talk()
	{
		return "Olá";
	}
	
	public void useItem(Item item)
	{
		if(item.getType() == "attack")
		{
			setAttack(getAttack() + item.getPoints());
		}
		else if(item.getType() == "defence")
		{
			setDefence(getDefence() + item.getPoints());
		}
		else if(item.getType() == "healing")
		{
			hpPoints += item.getPoints();
		}
	}
}
