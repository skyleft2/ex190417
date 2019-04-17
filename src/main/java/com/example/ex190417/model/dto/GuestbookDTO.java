package com.example.ex190417.model.dto;

import java.util.Date;

public class GuestbookDTO {

	private int idx;
	private String name;
	private String email;
	private String passwd;
	private String content; 
	private Date post_date;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	
	@Override
	public String toString() {
		return "GuestbookDTO [idx=" + idx + ", name=" + name + ", email=" + email + ", passwd=" + passwd + ", content="
				+ content + ", post_date=" + post_date + "]";
	}
	
	
}
