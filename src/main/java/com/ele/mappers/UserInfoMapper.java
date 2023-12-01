package com.ele.mappers;

import com.ele.entity.po.UserInfo;
import com.ele.entity.query.UserInfoQuery;
import com.ele.entity.vo.PaginationResultVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserInfoMapper<T, P> extends BaseMapper {

	/**
	 * 根据条件查询列表
	 */
	List<UserInfo> selectList(UserInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer selectCount(UserInfoQuery query);

	/**
	 * 分页查询
	 */
	//PaginationResultVO<UserInfo> findListByPage(UserInfoQuery query);


	/**
	 * 批量新增
	 */
	Integer insertBatch(List userInfoList);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List userInfoList);
	/**
	 * 根据IdAndAccount查询
	 */
	T selectByIdAndAccount(@Param("id") Integer id, @Param("account") String account);

	/**
	 * 根据IdAndAccount更新
	 */
	Integer updateByIdAndAccount(@Param("bean") T t, @Param("id") Integer id, @Param("account") String account);

	/**
	 * 根据IdAndAccount删除
	 */
	Integer deleteByIdAndAccount(@Param("id") Integer id, @Param("account") String account);

	T selectByAccount(@Param("account") String account);

	T findByAccount(@Param("account") String account);
}