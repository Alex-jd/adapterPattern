package test;

import adapter.DuckAdapter;
import adapter.TurkeyAdapter;
import ducks.MallardDuck;
import service.Duck;
import service.Turkey;
import turkey.WildTurkey;

public class DuckTestDrive {

	public static void main (String[] args) {
		Duck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		Turkey duckAdapter = new DuckAdapter(duck);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testTurkey(duckAdapter);
		
		
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
		
	}
	
	private static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}

	

	
}
