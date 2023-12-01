package com.ele.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;


/**
 * @Description:
 * @author:null
 * @Date:2023-08-26T19:40:05.308459400
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeKnowledge implements Serializable {
	/**
	 * 标题
	 */
	private String title;

	/**
	 * 图片
	 */
	private String chargeImage;

	/**
	 * 简介
	 */
	private String chargeTips;

	/**
	 * 内容
	 */
	private String chargeContent;

}