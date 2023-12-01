package com.ele.controller;

import java.util.List;
import com.ele.entity.po.EleInfo;
import com.ele.entity.query.EleInfoQuery;
import com.ele.service.EleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.ele.entity.vo.ResponseVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("/eleInfo")
public class EleInfoController extends ABaseController {

	@Resource
	private EleInfoService eleInfoService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(EleInfoQuery query) {
		return getSuccessResponseVO(eleInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add (EleInfo bean){
		this.eleInfoService.add(bean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch (@RequestBody List<EleInfo> listBean){
		this.eleInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 批量新增或修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch (@RequestBody List<EleInfo> listBean){
		this.eleInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据Id查询
	 */
	@RequestMapping("getEleInfoById")
	public ResponseVO getEleInfoById(Integer id){
		return getSuccessResponseVO(this.eleInfoService.getEleInfoById(id));
	}
	/**
	 * 根据Id更新
	 */
	@RequestMapping("updateEleInfoById")
	public ResponseVO updateEleInfoById( EleInfo bean, Integer id){
		this.eleInfoService.updateEleInfoById(bean,id);
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据Id删除
	 */
	@RequestMapping("deleteEleInfoById")
	public ResponseVO deleteEleInfoById(Integer id){
		 this.eleInfoService.deleteEleInfoById(id);
		return getSuccessResponseVO(null);
	}
}