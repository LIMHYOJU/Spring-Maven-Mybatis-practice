package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.MemberDao;
import springTest.ChangePasswordSerive;
import springTest.MemberInfoPrinter;
import springTest.MemberListPrinter;
import springTest.MemberPrinter;
import springTest.MemberRegisterService;

@Configuration
public class AppCtx {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	@Bean 
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePasswordSerive changePwdSvc() {
		return new ChangePasswordSerive(memberDao());
	}
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao(), memberPrinter());
	}
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(memberPrinter());
		return infoPrinter;
	}

}
