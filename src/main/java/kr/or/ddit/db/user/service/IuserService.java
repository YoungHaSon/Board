package kr.or.ddit.db.user.service;

import java.util.Map;

import kr.or.ddit.db.user.model.PageVo;
import kr.or.ddit.db.user.model.UsersVo;

public interface IuserService {

	/**
	* Method : getUser
	* 작성자 : PC13
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 정보 조회
	*/
	UsersVo getUser(String userId);
	
	Map<String, Object> textPagingList(Map<String, Object> map);
	
}
