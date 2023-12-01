package com.ele.controller;

import java.util.List;
import com.ele.entity.po.UserInfo;
import com.ele.entity.query.UserInfoQuery;
import com.ele.exception.BusinessException;
import com.ele.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.ele.entity.vo.ResponseVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends ABaseController {

	@Resource
	private UserInfoService userInfoService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(UserInfoQuery query) {
		return getSuccessResponseVO(userInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add (UserInfo bean){
		this.userInfoService.add(bean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch (@RequestBody List<UserInfo> listBean){
		this.userInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 批量新增或修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch (@RequestBody List<UserInfo> listBean){
		this.userInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据IdAndAccount查询
	 */
	@RequestMapping("getUserInfoByIdAndAccount")
	public ResponseVO getUserInfoByIdAndAccount(Integer id, String account){
		return getSuccessResponseVO(this.userInfoService.getUserInfoByIdAndAccount(id, account));
	}
	/**
	 * 根据IdAndAccount更新
	 */
	@RequestMapping("updateUserInfoByIdAndAccount")
	public ResponseVO updateUserInfoByIdAndAccount( UserInfo bean, Integer id, String account){
		this.userInfoService.updateUserInfoByIdAndAccount(bean,id, account);
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据IdAndAccount删除
	 */
	@RequestMapping("deleteUserInfoByIdAndAccount")
	public ResponseVO deleteUserInfoByIdAndAccount(Integer id, String account){
		 this.userInfoService.deleteUserInfoByIdAndAccount(id, account);
		return getSuccessResponseVO(null);
	}
	/**
	 *登录功能
	 */
	@RequestMapping("login")
		public ResponseVO login(String account, String password,Integer identityStatus) throws BusinessException {
		userInfoService.login(account, password,identityStatus);
		return getSuccessResponseVO(null);
	}
	/**
	 * 注册功能
	 */
	@RequestMapping("register")
	public ResponseVO register(Integer id,String account,String username, String password,Integer age,String sex,
							   String phoneNumber,Integer engineerId,String address,Integer identityStatus) throws BusinessException {
		userInfoService.register(id,account,username,password,age,sex,phoneNumber,engineerId,address,identityStatus);
		return getSuccessResponseVO(null);
	}

}