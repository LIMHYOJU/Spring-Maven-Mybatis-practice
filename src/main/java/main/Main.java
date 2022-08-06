package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppContext;
import simpleTest.Greeter;

public class Main {

	public static void main(String[] args) { // TODO Auto-generated method stb

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);

		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println("(g1 == g2) = " + (g1 == g2)); // true

		Greeter g3 = ctx.getBean("greeter_prototype", Greeter.class);
		Greeter g4 = ctx.getBean("greeter_prototype", Greeter.class);
		System.out.println("(g3 == g4) = " + (g3 == g4)); // false 
		ctx.close();

	}
}
