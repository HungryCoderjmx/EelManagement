package com.ele.service;

import java.util.List;
import com.ele.entity.vo.PaginationResultVO;
import com.ele.entity.po.EleInfo;
import com.ele.entity.query.EleInfoQuery;

public interface EleInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<EleInfo> findListByParam(EleInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(EleInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<EleInfo> findListByPage(EleInfoQuery query);

	/**
	 * 新增
	 */
	Integer add (EleInfo bean);

	/**
	 * 批量新增
	 */
	Integer addBatch (List<EleInfo> listBean);

	/**
	 * 批量新增或修改
	 */
	Integer addOrUpdateBatch (List<EleInfo> listBean);

	/**
	 * 根据Id查询
	 */
	EleInfo getEleInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateEleInfoById( EleInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteEleInfoById(Integer id);

}