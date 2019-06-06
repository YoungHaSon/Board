package kr.or.ddit.UserDao;

import static org.junit.Assert.assertEquals;
import kr.or.ddit.db.user.dao.IuserDao;
import kr.or.ddit.db.user.model.UsersVo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoTest {
	private static final Logger logger = LoggerFactory
			.getLogger(UserDaoTest.class);
	

	private IuserDao userDao;
	@Test
	public void UserDaoTest() {
		/***Given***/
		String userId = "brown";

		/***When***/
		UsersVo uservo = userDao.getUser(userId);
		
		/***Then***/
		assertEquals("브라운", uservo.getUser_name());
		logger.debug("uservo : " + uservo);
	}

}
