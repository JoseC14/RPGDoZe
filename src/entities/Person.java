package entities;

import java.util.Random;

public class Person {
	protected String name;
	protected Integer hpPoints;
	protected Integer manaPoints;
	protected Job job;
	
	
	
	public Person(String name, Integer hpPoints, Integer manaPoints, Job job) {
		this.name = name;
		this.hpPoints = hpPoints;
		this.manaPoints = manaPoints;
		this.job = job;
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
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	
	public Integer attack()
	{
		Random rand = new Random();
		
		int attack = 0;
		for( int i = 0; i < job.getAttack(); i++)
		{
			attack += rand.nextInt(6);
		}
		
		return attack;
	}
	
	public Integer defend()
	{
		Random rand = new Random();
		
		int defence = 0;
		for( int i = 0; i < job.getProtection(); i++)
		{
			defence += rand.nextInt(6);
		}
		
		return defence;
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
		
		return attack;
	}
}
