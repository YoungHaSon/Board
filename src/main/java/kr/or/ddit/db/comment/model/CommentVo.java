package kr.or.ddit.db.comment.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommentVo {

	private int com_id; // 댓글아이디
	private int text_id; // 게시글아이디
	private String user_id; // 작성자
	private String com_contet; // 내용
	private Date com_date; // 작성일시

	public CommentVo() {
	}

	/**
	 * @param com_id
	 * @param text_id
	 * @param user_id
	 * @param com_contet
	 * @param com_date
	 */
	public CommentVo(int com_id, int text_id, String user_id,
			String com_contet, Date com_date) {
		super();
		this.com_id = com_id;
		this.text_id = text_id;
		this.user_id = user_id;
		this.com_contet = com_contet;
		this.com_date = com_date;
	}

	// birth를 찍느....
	public String getBirthStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(com_date);
		if (date == null) {
			return "";
		}
		return date;
	}

	public int getCom_id() {
		return com_id;
	}

	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}

	public int getText_id() {
		return text_id;
	}

	public void setText_id(int text_id) {
		this.text_id = text_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCom_contet() {
		return com_contet;
	}

	public void setCom_contet(String com_contet) {
		this.com_contet = com_contet;
	}

	public Date getCom_date() {
		return com_date;
	}

	public void setCom_date(Date com_date) {
		this.com_date = com_date;
	}

	@Override
	public String toString() {
		return "CommentVo [com_id=" + com_id + ", text_id=" + text_id
				+ ", user_id=" + user_id + ", com_contet=" + com_contet
				+ ", com_date=" + com_date + "]";
	}
}
