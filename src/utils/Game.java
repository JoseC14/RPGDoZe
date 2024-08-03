package utils;

import java.util.Scanner;

import entities.Magic;
import entities.Person;
import entities.Player;

public class Game {

	
	public static boolean checkDistPoints(int points)
	{
		if(points < 0)
		{
			System.out.println("Pontos insuficientes");
			return true;
		}else
		{
			return false;
		}
	}
	
	public static void battle(Player player, Person enemy, Scanner sc)
	{
		int option, damage;
		int manaCost = 0;
		while(true)
		{			
			System.out.printf("Vida do inimigo: %d \n", enemy.getHpPoints());
			System.out.printf("Sua vida: %d \n", player.getHpPoints());
			System.out.println("O que deseja fazer?");
			System.out.print("1 - Atacar / 2 - Defender / 3 - Usar Magia / 4 - Falar / 5 - Item \n");
			
			option = sc.nextInt();
			if(option == 1)
			{
				enemy.takeDamage(player.attack());
			}
			else if(option == 2)
			{
				player.defend();
			}
			else if(option == 3)
			{
				System.out.println("Selecione a magia");
				System.out.println(" 1 - Queimar");
				System.out.println(" 2 - Congelar");
				System.out.println(" 3 - Ventania");
				System.out.println(" 4 - Terremoto");
				
				option = sc.nextInt();
				
				if(option == 1)
				{
					Magic fire = new Magic("Queimar","Fogo",2,2);	
					damage = fire.getAttack();
					System.out.printf("%s lança fogo no inimigo e o faz queimar em chamas causando %d de dano! \n", player.getName(),damage);
					enemy.takeDamage(damage);
					enemy.setStatus("Queimadura");
					manaCost = fire.getManaCost();
				}
				else if(option == 2)
				{
					Magic ice = new Magic("Congelar","Gelo",3,2);
					damage = ice.getAttack();
					enemy.takeDamage(ice.getAttack());
					enemy.setStatus("COngelado");
					System.out.printf("%s lança uma nevasca e congela o inimigo causando %d de dano! \n", player.getName(), damage);
					
					manaCost = ice.getManaCost();
				}
				else if(option == 3)
				{
					Magic wind = new Magic("Ventania","Vento",2,2);
					damage = wind.getAttack();
					enemy.takeDamage(damage);
					enemy.setStatus("Cego");
					System.out.printf("%s lança uma ventania e cega o inimigo com a poeira causando %d de dano! \n", player.getName(), damage);
					manaCost = wind.getManaCost();
				}
				else if(option == 4)
				{
					Magic ground = new Magic("Terremoto","Terra",1,3);
					damage = ground.getAttack();
					enemy.takeDamage(ground.getAttack());
					enemy.setStatus("Caído");
					System.out.printf("%s causa um terremoto e derruba o inimigo com a poeira causando %d de dano! \n", player.getName(), damage);
					manaCost = ground.getManaCost();
				}
				else
				{
					System.out.println("Opção inválida!");
				}
				
				player.spendMana(manaCost);
				
			}
		}
		
	}	
}
