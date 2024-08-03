package application;

import java.util.Scanner;

import entities.Player;
import entities.Person;
import utils.Game;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("*********************");
		System.out.println("*      RPGDoZe      *");
		System.out.println("*********************");
		Scanner sc = new Scanner(System.in);
		int option,hpPoints,manaPoints,attack,protection;
		int attributePoints = 15;
		String name,jobName;
		while(true)
		{
			System.out.println("Digite uma opção: ");
			System.out.println("1) Iniciar ");
			System.out.println("2) Contexto ");
			System.out.println("3) Manual");
			
			option = sc.nextInt();
			
			if(option == 1)
			{
				System.out.println("Bem vindo ao torneio da glória");
				while(true)
				{
					System.out.println("Distribua seus pontos em seus atributos");
					System.out.printf("%d pontos restantes\n", attributePoints);
					System.out.print("Vida: ");
					hpPoints = sc.nextInt();
					attributePoints -= hpPoints;
					sc.nextLine();
					
				
					if(Game.checkDistPoints(attributePoints))
					{
						continue;
					}
					System.out.printf("%d pontos restantes\n", attributePoints);
					System.out.print("Mana: ");
					manaPoints = sc.nextInt();
					attributePoints -= manaPoints;
					sc.nextLine();
					
					if(Game.checkDistPoints(attributePoints))
					{
						continue;
					}
					
					System.out.printf("%d pontos restantes\n", attributePoints);
					System.out.print("Ataque: ");
					attack = sc.nextInt();
					attributePoints -= attack;
					sc.nextLine();
					
					if(Game.checkDistPoints(attributePoints))
					{
						continue;
					}
					
					System.out.printf("%d pontos restantes\n", attributePoints);
					System.out.print("Defesa: ");
					protection = sc.nextInt();
					attributePoints -= protection;
					sc.nextLine();
					if(Game.checkDistPoints(attributePoints))
					{
						continue;
					}
					
					System.out.print("insira seu nome: ");
					name = sc.nextLine();

					Player player = new Player(name,hpPoints,manaPoints,attack,protection);
					
					System.out.println("Bem vindo");
					;
					Person enemyOne = new Person("João",30,3,4,3);
					System.out.println("O primeiro inimigo apareceu!");
					System.out.println("*********************");
					System.out.printf("* %s x %s *\n",player.getName(),enemyOne.getName());
					System.out.println("*********************");
					
					Game.battle(player, enemyOne, sc);
					
				}
				
				
				
				
			}else if(option == 2)
			{
				System.out.println("************");
				System.out.println("* CONTEXTO *");
				System.out.println("************");
				
				System.out.println("Você é um prisioneiro politico de um país que busca se libertar, mas para isso");
				System.out.println("precisará participar do TORNEIO DA GLÓRIA, um jogo em que prisioneiros\n "
						+ "são jogados em uma arena para se matarem e entreterem a massa do país.");
				
			}else if(option == 3)
			{
				System.out.println("************");
				System.out.println("*  MANUAL  *");
				System.out.println("************");
				
				System.out.println("Você tera 15 pontos para distribuir entre: ");
				
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("PONTOS DE VIDA - Se sua vida chegar a 0 você morre e o jogo reiniciará do menu");
				System.out.println("Você perde pontos de vida recebendo dano de outros prisioneiros ou armadilhas");
				
				System.out.println("--------------------------------------------------------------------------------");		
				System.out.println("PONTOS DE MANA - No mundo de RPGDoZe, magia é uma técnica proibida, mas que em certos caso pode ser usado");
				System.out.println("Como no Torneio da Glória, onde armas infudidos com poderes elementais foram criadas");
				System.out.println("Existem 4 tipos de armas infudidas");
				System.out.println("Fogo, Água, Raio e Ar");
				
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("ATAQUE - O seu poder de dar dano em inimigos ");
				System.out.println("Armas aumentam o poder de dano que você pode dar em inimigos junto com seus pontos de ATAQUE");
				
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("DEFESA - O seu poder de receber menos dano");
				System.out.println("Armaduras aumentam o poder de receber menos danos de inimigos");
				
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("AÇÃO ESPECIAL - Ação que carrega durante o combate, que você irá escolher enquanto faz seu personagem");
				
				System.out.println("***********************************************************************************");
				System.out.println("COMO FUNCIONA O COMBATE: ");
				System.out.println("Cada rodada você e seu inimigo poderam fazer uma ação, aqui cabe apenas falarmos da ação que você como jogador podera fazer");
				System.out.println("ATACAR - Usa seus pontos de ataque para atacar o oponente, que funciona da seguinte forma, cada ponto de ataque");
				System.out.println("Te dá direito de dar dano de 1 a 6, então suponhamos que seu ataque seja 3, o máximo de dano que você póde dar é 3 e o máximo é 18");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				
				System.out.println("DEFENDER - USa seus pontos de defesa para receber menos dano, o sistema de o quanto de defesa você vai tirar é igualmente o ataque");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("FALAR - Usado em ocasiões especiais, permite você falar com o inimigo");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("USAR ITEM - Permite você usar um item que pode aumentar um de seus atributos que foi listado acima");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("MAGIA - Apenas usável quando você está equipado com uma arma infudida gasta seus pontos de mana que podem ser recuperandos usando itens no meio do combate");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
				
			}
			
		}
	}

}
