package entities;

import java.util.Random;

public class Person {
	protected String name;
	protected Integer hpPoints;
	protected Integer manaPoints;
	protected Integer attack;
	protected Integer defence;
	protected String status;
	protected Boolean turn;
	
	public Person(String name, Integer hpPoints, Integer manaPoints, Integer attack, Integer defence) {
		this.name = name;
		this.hpPoints = hpPoints;
		this.manaPoints = manaPoints;
		this.attack = attack;
		this.defence = defence;
		this.turn = false;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHpPoints() {
		return hpPoints;
	}
	public void setHpPoints(Integer hpPoints) {
		this.hpPoints = hpPoints;
	}
	public Integer getManaPoints() {
		return manaPoints;
	}
	public void setManaPoints(Integer manaPoints) {
		this.manaPoints = manaPoints;
	}
	
	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefence() {
		return defence;
	}

	public void setDefence(Integer defence) {
		this.defence = defence;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Integer attack()
	{
		Random rand = new Random();
		
		int attack = 0;
		for( int i = 0; i < getAttack(); i++)
		{
			attack += rand.nextInt(6);
		}
		turn = false;
		return attack;
		
	}
	
	public void defend()
	{
		Random rand = new Random();
		
		for( int i = 0; i < getDefence(); i++)
		{
			this.defence += rand.nextInt(6);
		}
		turn = false;
		
	}
	
	public Integer useMagic(Magic magic)
	{
		Random rand = new Random();
		
		manaPoints -= magic.getManaCost();
		
		int attack = 0;
		for( int i = 0; i < magic.getAttack(); i++)
		{
			attack += rand.nextInt(6);
		}
		
		turn = false;
		return attack;
	}
	
	public void takeDamage(int damage)
	{
		setHpPoints(getHpPoints() - damage);
		turn = true;
	}
	
	public void spendMana(Integer cost)
	{
		this.setManaPoints(this.getManaPoints() - cost);
	}
	
	public void checkStatus(Magic magic)
	{
		if(magic.getName() == "Fogo")
		{
			if(turn == true)
			{
				takeDamage(magic.getAttack());
			}
		}
	}
	
}
