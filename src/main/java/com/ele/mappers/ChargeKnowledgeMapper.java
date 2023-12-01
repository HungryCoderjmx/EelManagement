package com.ele.mappers;

import com.ele.entity.po.ChargeKnowledge;
import com.ele.entity.query.ChargeKnowledgeQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:Mapper
 * @author:null
 * @Date:2023-08-26T19:40:05.309456700
 */
@Mapper
public interface ChargeKnowledgeMapper<T, P> extends BaseMapper {

    /**
     * 根据条件查询列表
     */
    List<ChargeKnowledge> selectList(ChargeKnowledgeQuery query);

    /**
     * 根据条件查询数量
     */
    Integer selectCount(ChargeKnowledgeQuery query);

    /**
     * 批量新增
     */
    Integer insertBatch(List chargeKnowledgeList);

    /**
     * 批量新增或修改
     */
    Integer insertOrUpdateBatch(List chargeKnowledgeList);

}