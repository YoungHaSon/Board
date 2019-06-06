package kr.or.ddit.db.user.model;

public class UsersVo {
	private String user_id; // 아이디
	private String user_name; // 이름
	private String user_alias; // 별명
	private String user_pass; // 비밀번호

	public UsersVo() {
	}

	/**
	 * @param user_id
	 * @param user_name
	 * @param user_alias
	 * @param user_pass
	 */
	public UsersVo(String user_id, String user_name, String user_alias,
			String user_pass) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_alias = user_alias;
		this.user_pass = user_pass;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_alias() {
		return user_alias;
	}

	public void setUser_alias(String user_alias) {
		this.user_alias = user_alias;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	@Override
	public String toString() {
		return "Users1Vo [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_alias=" + user_alias + ", user_pass=" + user_pass
				+ "]";
	}
}
