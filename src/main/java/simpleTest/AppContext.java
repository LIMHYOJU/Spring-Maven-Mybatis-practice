package simpleTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration//설정 클래스
public class AppContext {
	@Bean//빈 객체 설정
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s,안녕하세요");
		return g;
	}
	
	@Bean//빈 객체 설정
	@Scope("prototype")
	public Greeter greeter_prototype() {
		Greeter g = new Greeter();
		g.setFormat("%s,안녕하세요");
		return g;
	}
}
