package kr.or.ddit.db.user.service;

import java.util.HashMap;
import java.util.Map;

import kr.or.ddit.db.user.dao.IuserDao;
import kr.or.ddit.db.user.dao.UserDao;
import kr.or.ddit.db.user.model.PageVo;
import kr.or.ddit.db.user.model.UsersVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService implements IuserService {

	//--------------------------
		//요부분 이해 .....XXX
		private IuserDao dao;
		
		//UserDao에 있는 것을 쓰기위해!! 필요!
		public UserService() {
			dao = new UserDao();
		}
		//--------------------------
		
		private static final Logger logger = LoggerFactory
				.getLogger(UserService.class);
		
		@Override
		public UsersVo getUser(String userId) {
			return dao.getUser(userId);
		}

		@Override
		public Map<String, Object> textPagingList(Map<String, Object> map) {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			int a = (int) resultMap.put("textList", dao.textPagingList(map));
			int textCnt = dao.textCnt();
			int paginationSize = (int)Math.ceil((double)textCnt/a);
			resultMap.put("paginationSize", paginationSize);
			return resultMap;
		}
	

}
