package assembler;

import dao.MemberDao;
import springTest.ChangePasswordSerive;
import springTest.MemberRegisterService;

public class Assembler {

	private MemberDao mamberDao;
	private ChangePasswordSerive pwdSvc;
	private MemberRegisterService regSvc;
	
	public Assembler() {
		// TODO Auto-generated constructor stub
		mamberDao =new MemberDao();
		regSvc= new MemberRegisterService(mamberDao);
		pwdSvc= new ChangePasswordSerive(mamberDao);
	}

	public MemberDao getMamberDao() {
		return mamberDao;
	}

	public ChangePasswordSerive getPwdSvc() {
		return pwdSvc;
	}

	public MemberRegisterService getRegSvc() {
		return regSvc;
	}
}
