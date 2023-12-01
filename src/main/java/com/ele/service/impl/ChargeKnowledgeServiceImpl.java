package com.ele.service.impl;

import java.util.List;
import com.ele.entity.query.SimplePage;
import com.ele.entity.vo.PaginationResultVO;
import com.ele.entity.po.ChargeKnowledge;
import com.ele.entity.query.ChargeKnowledgeQuery;
import com.ele.enums.PageSize;
import com.ele.mappers.ChargeKnowledgeMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ele.service.ChargeKnowledgeService;

import javax.annotation.Resource;

@Service("chargeKnowledgeService")
public class ChargeKnowledgeServiceImpl implements ChargeKnowledgeService{

	@Resource
	private ChargeKnowledgeMapper<ChargeKnowledge,ChargeKnowledgeQuery> chargeKnowledgeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ChargeKnowledge> findListByParam(ChargeKnowledgeQuery query) {
		return this.chargeKnowledgeMapper.selectList(query);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Integer findCountByParam(ChargeKnowledgeQuery query){

		return this.chargeKnowledgeMapper.selectCount(query);
	}
	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVO<ChargeKnowledge> findListByPage(ChargeKnowledgeQuery query){
		int count = this.findCountByParam(query);
		int pageSize =query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<ChargeKnowledge> list = this.findListByParam(query);
		PaginationResultVO<ChargeKnowledge> result = new PaginationResultVO(count, page.getPageSize(),page.getPageNo(), page.getPageTotal(), list);
		return result;
	}
	/**
	 * 新增
	 */
	@Override
	public Integer add (ChargeKnowledge bean){

		return this.chargeKnowledgeMapper.insert(bean);
	}
	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch (List<ChargeKnowledge> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.chargeKnowledgeMapper.insertBatch(listBean);
	}
	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer addOrUpdateBatch (List<ChargeKnowledge> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.chargeKnowledgeMapper.insertOrUpdateBatch(listBean);

	}
}