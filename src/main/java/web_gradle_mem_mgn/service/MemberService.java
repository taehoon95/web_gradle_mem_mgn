package web_gradle_mem_mgn.service;

import java.util.List;

import web_gradle_mem_mgn.dao.impl.MemberDaoImpl;
import web_gradle_mem_mgn.dto.Member;
import web_gradle_mem_mgn.ds.JndiDs;

public class MemberService {
	private MemberDaoImpl dao;
	
	public MemberService() {
		dao = MemberDaoImpl.getInstance();
		dao.setCon(JndiDs.getConnection());
	}
	
	
	public Member loginMember(Member member) {
		return dao.selectMemberById(member);
	}
	
	public Member getMember(Member member) {
		return dao.selectGetMemberById(member);
	}

	public List<Member> showMembers(){
		return dao.selectMember();
	}
	
	
	
	public int joinMember(Member member) {
		return dao.insertMember(member);
	}
	
	public void delMember(String id) {
		dao.delMember(id);
	}

	public void modiMember(Member member) {
		dao.updateMember(member);
	}
	
	
}
