package entities;

import java.util.ArrayList;
import java.util.List;

public class Iventory {
	private List<Item> listItem = new ArrayList<>();
	
	private Integer capacity;
	
	public Iventory(Integer capacity)
	{
		this.capacity = capacity;
	}
	
	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	
	public void addItem(Item item)
	{
		if(listItem.size() < capacity)
		{
			listItem.add(item);
		}	
	}
	
	public void removeItem(Item item)
	{
		if(listItem.size() != 0)
		{
			listItem.remove(item);
		}
	}
}
