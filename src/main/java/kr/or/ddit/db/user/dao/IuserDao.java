package kr.or.ddit.db.user.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.db.text.model.TextVo;
import kr.or.ddit.db.user.model.PageVo;
import kr.or.ddit.db.user.model.UsersVo;

public interface IuserDao {
	
	/**
	* Method : getUser
	* 작성자 : PC13
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 정보 조회
	*/
	UsersVo getUser(String userId);
	
	/**
	* Method : textPagingList
	* 작성자 : PC13
	* 변경이력 :
	* @param pageVo
	* @return
	* Method 설명 : 게시글 페이징 리스트 조회
	*/
	List<TextVo> textPagingList(Map<String, Object> map);
	
	/**
	* Method : textCnt
	* 작성자 : PC13
	* 변경이력 :
	* @return
	* Method 설명 : 게시글 전체수 조회
	*/
	int textCnt();
	
}
