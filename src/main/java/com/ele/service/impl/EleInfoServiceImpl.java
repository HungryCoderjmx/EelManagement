package com.ele.service.impl;

import java.util.List;
import com.ele.entity.query.SimplePage;
import com.ele.entity.vo.PaginationResultVO;
import com.ele.entity.po.EleInfo;
import com.ele.entity.query.EleInfoQuery;
import com.ele.enums.PageSize;
import com.ele.mappers.EleInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ele.service.EleInfoService;

import javax.annotation.Resource;

@Service("eleInfoService")
public class EleInfoServiceImpl implements EleInfoService{

	@Resource
	private EleInfoMapper<EleInfo,EleInfoQuery> eleInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<EleInfo> findListByParam(EleInfoQuery query) {

		return this.eleInfoMapper.selectList(query);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Integer findCountByParam(EleInfoQuery query){

		return this.eleInfoMapper.selectCount(query);
	}
	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVO<EleInfo> findListByPage(EleInfoQuery query){
		int count = this.findCountByParam(query);
		int pageSize =query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<EleInfo> list = this.findListByParam(query);
		PaginationResultVO<EleInfo> result = new PaginationResultVO(count, page.getPageSize(),page.getPageNo(), page.getPageTotal(), list);
		return result;
	}
	/**
	 * 新增
	 */
	@Override
	public Integer add (EleInfo bean){

		return this.eleInfoMapper.insert(bean);
	}
	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch (List<EleInfo> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.eleInfoMapper.insertBatch(listBean);
	}
	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer addOrUpdateBatch (List<EleInfo> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.eleInfoMapper.insertOrUpdateBatch(listBean);

	}
	/**
	 * 根据Id查询
	 */
	@Override
	public EleInfo getEleInfoById(Integer id){
		return this.eleInfoMapper.selectById(id);
	}
	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateEleInfoById( EleInfo bean, Integer id){
		return this.eleInfoMapper.updateById(bean,id);
	}
	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteEleInfoById(Integer id){
		return this.eleInfoMapper.deleteById(id);
	}
}