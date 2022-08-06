package springTest;

import java.util.Collection;

import dao.MemberDao;

public class MemberListPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao,MemberPrinter printer) {
		// TODO Auto-generated constructor stub
		this.memberDao= memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		// TODO Auto-generated constructor stub
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
}
