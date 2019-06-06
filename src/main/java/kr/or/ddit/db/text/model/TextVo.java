package kr.or.ddit.db.text.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TextVo {
	private int text_id; //게시글아이디
	private String user_id; //작성자
	private int text_id2; //부모게시글아이디 = 게시글아이디
	private int board_id; //게시판아이디
	private String text_title; //제목
	private String text_content; //내용
	private Date text_date; //작성일시
	private String col; //게시글상태

	public TextVo() {
	}
	
	/**
	 * @param text_id
	 * @param user_id
	 * @param text_id2
	 * @param board_id
	 * @param text_title
	 * @param text_content
	 * @param text_date
	 * @param col
	 */
	public TextVo(int text_id, String user_id, int text_id2, int board_id,
			String text_title, String text_content, Date text_date, String col) {
		super();
		this.text_id = text_id;
		this.user_id = user_id;
		this.text_id2 = text_id2;
		this.board_id = board_id;
		this.text_title = text_title;
		this.text_content = text_content;
		this.text_date = text_date;
		this.col = col;
	}
	// birth를 찍느....
	public String getBirthStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(text_date);
		if (date == null) {
			return "";
		}
		return date;
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

	public int getText_id2() {
		return text_id2;
	}

	public void setText_id2(int text_id2) {
		this.text_id2 = text_id2;
	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public String getText_title() {
		return text_title;
	}

	public void setText_title(String text_title) {
		this.text_title = text_title;
	}

	public String getText_content() {
		return text_content;
	}

	public void setText_content(String text_content) {
		this.text_content = text_content;
	}

	public Date getText_date() {
		return text_date;
	}

	public void setText_date(Date text_date) {
		this.text_date = text_date;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}
	@Override
	public String toString() {
		return "TextVo [text_id=" + text_id + ", user_id=" + user_id
				+ ", text_id2=" + text_id2 + ", board_id=" + board_id
				+ ", text_title=" + text_title + ", text_content="
				+ text_content + ", text_date=" + text_date + ", col=" + col
				+ "]";
	}
	
}
