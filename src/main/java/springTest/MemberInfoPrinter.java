package springTest;

import dao.MemberDao;

public class MemberInfoPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberinfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			System.out.println("유저없음");
			return;
		}
		printer.print(member);
		System.out.println();
	}
	
	
}
