package simpleTest;

import dao.MemberDao;

public class ChangePasswordSerive {

	private MemberDao memberDao;
	
	public ChangePasswordSerive(MemberDao memberDao) {
		// TODO Auto-generated constructor stub
		this.memberDao = memberDao;
	}
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null) 
			throw new MemberNotFoundException();
		
		member.changePassword(newPwd, oldPwd);
		memberDao.update(member);
	}
}
