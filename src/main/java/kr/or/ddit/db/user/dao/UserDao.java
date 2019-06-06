package kr.or.ddit.db.user.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.db.text.model.TextVo;
import kr.or.ddit.db.user.model.PageVo;
import kr.or.ddit.db.user.model.UsersVo;
import kr.or.ddit.mybatis.MyBatisUtil;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao implements IuserDao {

	private static final Logger logger = LoggerFactory
			.getLogger(UserDao.class);
	
	/**
	* Method : getUser
	* 작성자 : PC13
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 정보 조회
	*/
	@Override
	public UsersVo getUser(String userId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		UsersVo user = sqlSession.selectOne("users.getUser",userId);
		sqlSession.close();
		return user;
	}

	@Override
	public List<TextVo> textPagingList(Map<String, Object> map) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<TextVo> textList = sqlSession.selectList("users.textPagingList",map);
		sqlSession.close();
		return textList;
	}

	@Override
	public int textCnt() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int textCnt = (Integer) sqlSession.selectOne("users.textCnt");
		return textCnt;
	}



}
