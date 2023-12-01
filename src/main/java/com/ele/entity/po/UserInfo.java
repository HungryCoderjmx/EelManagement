package com.ele.entity.po;


import java.io.Serializable;


public class UserInfo implements Serializable {
	/**
	 * 索引
	 */
	private Integer id;

	/**
	 * 账户
	 */
	private String account;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 联系电话
	 */
	private String phoneNumber;

	/**
	 * 维修工号
	 */
	private Integer engineerId;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 身份状态
	 */
	private Integer identityStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getEngineerId() {
		return engineerId;
	}

	public void setEngineerId(Integer engineerId) {
		this.engineerId = engineerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIdentityStatus() {
		return identityStatus;
	}

	public void setIdentityStatus(Integer identityStatus) {
		this.identityStatus = identityStatus;
	}

	public UserInfo() {
	}

	public UserInfo(Integer id, String account, String username, String password, Integer age, String sex, String phoneNumber, Integer engineerId, String address, Integer identityStatus) {
		this.id = id;
		this.account = account;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.engineerId = engineerId;
		this.address = address;
		this.identityStatus = identityStatus;
	}
}
