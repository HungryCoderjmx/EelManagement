package com.ele.service;

import java.util.List;
import com.ele.entity.vo.PaginationResultVO;
import com.ele.entity.po.ChargeKnowledge;
import com.ele.entity.query.ChargeKnowledgeQuery;

public interface ChargeKnowledgeService{

	/**
	 * 根据条件查询列表
	 */
	List<ChargeKnowledge> findListByParam(ChargeKnowledgeQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(ChargeKnowledgeQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<ChargeKnowledge> findListByPage(ChargeKnowledgeQuery query);

	/**
	 * 新增
	 */
	Integer add (ChargeKnowledge bean);

	/**
	 * 批量新增
	 */
	Integer addBatch (List<ChargeKnowledge> listBean);

	/**
	 * 批量新增或修改
	 */
	Integer addOrUpdateBatch (List<ChargeKnowledge> listBean);

}