package it.epicode.be;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.be.model.BasePizza;
import it.epicode.be.model.Drink;
import it.epicode.be.model.Menu;
import it.epicode.be.model.ConfigMenu;
import it.epicode.be.model.Pizza;
import it.epicode.be.model.Topping;
import it.epicode.be.model.topping.Cheese;
import it.epicode.be.model.topping.FamilySize;
import it.epicode.be.model.topping.Ham;
import it.epicode.be.model.topping.Pineapple;


@SuppressWarnings("unused")
public class GestioneMenu {
	public static void main(String[] args) {
		SpringApplication.run(GestioneMenu.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigMenu.class);
		
		Menu godfather = (Menu)context.getBean("godfather");
		godfather.stampaMenu();
		
	}
}
