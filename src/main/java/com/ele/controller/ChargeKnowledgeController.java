package com.ele.controller;

import java.util.List;
import com.ele.entity.po.ChargeKnowledge;
import com.ele.entity.query.ChargeKnowledgeQuery;
import com.ele.service.ChargeKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.ele.entity.vo.ResponseVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("/chargeKnowledge")
public class ChargeKnowledgeController extends ABaseController {

	@Resource
	private ChargeKnowledgeService chargeKnowledgeService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(ChargeKnowledgeQuery query) {
		return getSuccessResponseVO(chargeKnowledgeService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add (ChargeKnowledge bean){
		this.chargeKnowledgeService.add(bean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch (@RequestBody List<ChargeKnowledge> listBean){
		this.chargeKnowledgeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 批量新增或修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch (@RequestBody List<ChargeKnowledge> listBean){
		this.chargeKnowledgeService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}
}