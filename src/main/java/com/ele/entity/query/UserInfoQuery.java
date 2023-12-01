package com.ele.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




/**
 * @Description:
 * @author:null
 * @Date:2023-08-26T19:40:05.321426100
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoQuery extends BaseQuery{
	/**
	 * 索引
	 */
	private Integer id;

	/**
	 * 账户
	 */
	private String account;

	private String accountFuzzy;

	/**
	 * 用户名
	 */
	private String username;

	private String usernameFuzzy;

	/**
	 * 密码
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 性别
	 */
	private String sex;

	private String sexFuzzy;

	/**
	 * 联系电话
	 */
	private String phoneNumber;

	private String phoneNumberFuzzy;

	/**
	 * 维修工号
	 */
	private Integer engineerId;

	/**
	 * 地址
	 */
	private String address;

	private String addressFuzzy;

	/**
	 * 身份状态
	 */
	private Integer identityStatus;

}