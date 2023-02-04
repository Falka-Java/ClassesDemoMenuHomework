package app;

import java.util.Scanner;

import lib.Human;
import lib.Menu;
import lib.Repos;

public class Programm {

	public static void main(String[] args) {
		//Initialization repo
		Repos humanRepos = new Repos();
		humanRepos.addHuman(new Human("Anna", "01.01.2005", "1234", "Ukraine", "Kyiv", "Lomonosova"));
		
		
		//Initialization menu
		Menu menu = new Menu();
		do {
			menu.display();
			int ch = menu.getChoice();
			switch(ch) {
			case 1:
				humanRepos.addHuman(menu.addHumanDialog());
				System.out.println("Human was successfully added!");
				break;
			case 2:
			{
				int foudedHumanIndex = humanRepos.findHuman(menu.getHumanName());
				if(foudedHumanIndex != -1) {
					humanRepos.delHuman(foudedHumanIndex);
					System.out.println("Human was successfully deleted");
				}else
					System.out.println("Could not find the human");
				break;
			}
			case 3:
				humanRepos.display();
				break;
			case 4:{
				int foudedHumanIndex = menu.getHumanId();
				Human res = humanRepos.getHuman(foudedHumanIndex);
				if(res != null)
					System.out.println(res);
				else
					System.out.println("Human was not found");
				
				break;
			}
			case 5:
			{
				int foudedHumanIndex = humanRepos.findHuman(menu.getHumanName());
				System.out.println(humanRepos.getHuman(foudedHumanIndex));
				break;
			}
			case 6:
				//Exiting programm
				return;

			default:
				break;
			}
		}while(menu.allowContinue());
		
		// Human test
		//Human h = new Human("Anna", "01.01.2005", "1234", "Ukraine", "Kyiv", "Lomonosova");
		//System.out.println(h);
		
		//Repos test
		/*
		Repos p = new Repos();
		Human[] people = new Human[] {
			new Human("Human-1","01.01.2005","Phone-1","Ukraine","Kyiv","Street-1"),
			new Human("Human-2","01.01.2005","Phone-2","Ukraine","Kyiv","Street-2"),
			new Human("Human-3","01.01.2005","Phone-3","Ukraine","Kyiv","Street-3")
		};
		for(Human x : people) {
			p.addHuman(x);
		}
		
		p.display();*/
	}

}
