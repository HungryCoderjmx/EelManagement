package com.ele.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




/**
 * @Description:
 * @author:null
 * @Date:2023-08-26T19:40:05.307458900
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeKnowledgeQuery extends BaseQuery{
	/**
	 * 标题
	 */
	private String title;

	private String titleFuzzy;

	/**
	 * 图片
	 */
	private String chargeImage;

	private String chargeImageFuzzy;

	/**
	 * 简介
	 */
	private String chargeTips;

	private String chargeTipsFuzzy;

	/**
	 * 内容
	 */
	private String chargeContent;

	private String chargeContentFuzzy;

}