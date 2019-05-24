package kr.or.ddit.user.service;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.user.dao.IuserDao;
import kr.or.ddit.user.dao.UserDao;
import kr.or.ddit.user.model.UserVo;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceTest {

	/*
	사용자 전체리스트를 조회 하는 메서드
	1. 메서드 인자가 필요한가?
	2. 리턴 타입은 뭐가 될까? List<UserVo>
	3. 메서드 이름은 뭐가 적당하지? : userList
	*/
	
	
	private static final Logger logger = LoggerFactory
			.getLogger(UserServiceTest.class);
	
	private IuserService service;
	
	@Before
	public void setup(){
		service = new UserService();
		logger.debug("setup");
	}
	
	@Test
	public void userList(){
		
		/***Given***/

		/***When***/
		List<UserVo> userList = service.userList();
		
		/***Then***/
		assertNotNull(userList);
		assertEquals("brown", userList.get(0).getUserId());
		assertEquals(105, userList.size());
		logger.debug("userList : " + userList);
		
	}
	
	@Test
	public void getUser(){
		/***Given***/
		String userId1 = "cony";
		
		/***When***/
		UserVo uservo = service.getUser(userId1); 
		
		/***Then***/
		assertEquals("코니", uservo.getName()); 
		logger.debug("uservo : " + uservo);
		
	}
	
	//

	
}
