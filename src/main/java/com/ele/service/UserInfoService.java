package com.ele.service;

import java.util.List;
import com.ele.entity.vo.PaginationResultVO;
import com.ele.entity.po.UserInfo;
import com.ele.entity.query.UserInfoQuery;
import com.ele.exception.BusinessException;

public interface UserInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<UserInfo> findListByParam(UserInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(UserInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserInfo> findListByPage(UserInfoQuery query);

	/**
	 * 新增
	 */
	Integer add (UserInfo bean);

	/**
	 * 批量新增
	 */
	Integer addBatch (List<UserInfo> listBean);

	/**
	 * 批量新增或修改
	 */
	Integer addOrUpdateBatch (List<UserInfo> listBean);

	/**
	 * 根据IdAndAccount查询
	 */
	UserInfo getUserInfoByIdAndAccount(Integer id, String account);

	/**
	 * 根据IdAndAccount更新
	 */
	Integer updateUserInfoByIdAndAccount( UserInfo bean, Integer id, String account);

	/**
	 * 根据IdAndAccount删除
	 */
	Integer deleteUserInfoByIdAndAccount(Integer id, String account);

    void login(String account, String password,Integer identityStatus) throws BusinessException;

	void register(Integer id, String account,String username,String password, Integer age, String sex,
				  String phoneNumber, Integer engineerId, String address, Integer identityStatus) throws BusinessException;
}