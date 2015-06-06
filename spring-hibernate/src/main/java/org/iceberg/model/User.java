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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
