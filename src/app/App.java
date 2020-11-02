package app;

import animal.AnimalTest;
import menu.Menu;
import vacina.VacinaTest;

public class App {
	public static Menu menu = Menu.criarMenu();
	public static void main(String[] args) {
		//test();
		while(true) {
			menu.escolherOpcao();
		}
	}
	
	public static void test() {
		AnimalTest.test();
		VacinaTest.test();
		System.exit(0);
	}
	
}
