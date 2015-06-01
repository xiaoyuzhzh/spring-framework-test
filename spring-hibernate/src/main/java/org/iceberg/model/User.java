package org.iceberg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.iceberg.model.base.BaseModel;

@Entity
@Table(name="SYS_USER")
public class User extends BaseModel{
	@Column(name="USERNAME",length=30)
	private String userName;
	
	@Column(name="PASSWORD",length=30)
	private String passWord;
	
	@Column(name="NICKNAME",length=50)
	private String nickName;

	protected String getUserName() {
		return userName;
	}

	protected void setUserName(String userName) {
		this.userName = userName;
	}

	protected String getPassWord() {
		return passWord;
	}

	protected void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	protected String getNickName() {
		return nickName;
	}

	protected void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
}
