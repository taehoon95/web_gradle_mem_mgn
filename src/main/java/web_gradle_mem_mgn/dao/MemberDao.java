package web_gradle_mem_mgn.dao;

import java.util.List;

import web_gradle_mem_mgn.dto.Member;

public interface MemberDao {
	List<Member> selectMember();
	
	Member selectMemberById(Member member);
	
	Member selectGetMemberById(Member member);
	
	int insertMember(Member member);
	int delMember(String id);
	int updateMember(Member member);
}
