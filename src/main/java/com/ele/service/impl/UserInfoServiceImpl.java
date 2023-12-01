package com.ele.service.impl;

import java.util.List;
import com.ele.entity.query.SimplePage;
import com.ele.entity.vo.PaginationResultVO;
import com.ele.entity.po.UserInfo;
import com.ele.entity.query.UserInfoQuery;
import com.ele.enums.PageSize;
import com.ele.exception.BusinessException;
import com.ele.mappers.UserInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ele.service.UserInfoService;

import javax.annotation.Resource;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	private UserInfoMapper<UserInfo,UserInfoQuery> userInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<UserInfo> findListByParam(UserInfoQuery query) {

		return this.userInfoMapper.selectList(query);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Integer findCountByParam(UserInfoQuery query){

		return this.userInfoMapper.selectCount(query);
	}
	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVO<UserInfo> findListByPage(UserInfoQuery query){
		int count = this.findCountByParam(query);
		int pageSize =query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<UserInfo> list = this.findListByParam(query);
		PaginationResultVO<UserInfo> result = new PaginationResultVO(count, page.getPageSize(),page.getPageNo(), page.getPageTotal(), list);
		return result;
	}
	/**
	 * 新增
	 */
	@Override
	public Integer add (UserInfo bean){
		return this.userInfoMapper.insert(bean);
	}
	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch (List<UserInfo> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoMapper.insertBatch(listBean);
	}
	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer addOrUpdateBatch (List<UserInfo> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoMapper.insertOrUpdateBatch(listBean);

	}
	/**
	 * 根据IdAndAccount查询
	 */
	@Override
	public UserInfo getUserInfoByIdAndAccount(Integer id, String account){
		return this.userInfoMapper.selectByIdAndAccount(id, account);
	}
	/**
	 * 根据IdAndAccount更新
	 */
	@Override
	public Integer updateUserInfoByIdAndAccount( UserInfo bean, Integer id, String account){
		return this.userInfoMapper.updateByIdAndAccount(bean,id, account);
	}
	/**
	 * 根据IdAndAccount删除
	 */
	@Override
	public Integer deleteUserInfoByIdAndAccount(Integer id, String account){
		return this.userInfoMapper.deleteByIdAndAccount(id, account);
	}

	@Override
	public void login(String account, String password,Integer identityStatus) throws BusinessException {
		UserInfo userInfo = this.userInfoMapper.selectByAccount(account);
		if (userInfo==null||!userInfo.getPassword().equals(password)){
			throw new BusinessException("账号、密码");
		}
		if (identityStatus==0){
				System.out.println("用户登录");
			}else if (identityStatus==1){
				System.out.println("维修工登录");
			}else if (identityStatus==2){
				System.out.println("管理员登录");
			}else {
				System.out.println("未知身份");
			}
	}

	@Override
	public void register(Integer id,String account,String username,String password, Integer age, String sex,
						 String phoneNumber, Integer engineerId, String address, Integer identityStatus) throws BusinessException {
		UserInfo userInfo = this.userInfoMapper.findByAccount(account);
		if (userInfo!=null){
			throw new BusinessException("账户已存在，无法注册");
		}
		userInfo = new UserInfo();
		userInfo.setId(id);
		userInfo.setAccount(account);
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		userInfo.setAge(age);
		userInfo.setSex(sex);
		userInfo.setPhoneNumber(phoneNumber);
		userInfo.setEngineerId(engineerId);
		userInfo.setAddress(address);
		userInfo.setIdentityStatus(identityStatus);
		this.userInfoMapper.insert(userInfo);
	}
}