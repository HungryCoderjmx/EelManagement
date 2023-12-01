package com.ele.mappers;

import com.ele.entity.po.EleInfo;
import com.ele.entity.query.EleInfoQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EleInfoMapper<T, P> extends BaseMapper {

	/**
	 * 根据条件查询列表
	 */
	List<EleInfo> selectList(EleInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer selectCount(EleInfoQuery query);

	/**
	 * 分页查询
	 */
	//PaginationResultVO<EleInfo> findCountByParam(EleInfoQuery query);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List eleInfoList);
	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List eleInfoList);
	/**
	 * 根据Id查询
	 */
	T selectById(@Param("id") Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(@Param("bean") T t, @Param("id") Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(@Param("id") Integer id);


}