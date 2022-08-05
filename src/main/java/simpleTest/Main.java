package simpleTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stb

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

		Greeter g = ctx.getBean("greeter",Greeter.class);
		String msg =g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}
