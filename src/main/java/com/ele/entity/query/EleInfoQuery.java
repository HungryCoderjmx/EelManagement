package com.ele.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;


/**
 * @Description:
 * @author:null
 * @Date:2023-08-26T19:40:05.316438
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EleInfoQuery extends BaseQuery{
	/**
	 * 索引
	 */
	private Integer id;

	/**
	 * 电桩编号
	 */
	private String number;

	private String numberFuzzy;

	/**
	 * 电桩类别
	 */
	private String type;

	private String typeFuzzy;

	/**
	 * 图片
	 */
	private String imagePath;

	private String imagePathFuzzy;

	/**
	 * 输入电压
	 */
	private Integer inputV;

	/**
	 * 输出功率
	 */
	private Integer outputW;

	/**
	 * 所处位置
	 */
	private String location;

	private String locationFuzzy;

	/**
	 * 每时单价
	 */
	private Integer moneyH;

	/**
	 * 使用方式
	 */
	private String useWay;

	private String useWayFuzzy;

	/**
	 * 注意事项
	 */
	private String tips;

	private String tipsFuzzy;

	/**
	 * 报修时间
	 */
	private Date reportTime;

	private String reportTimeStart;

	private String reportTimeEnd;

	/**
	 * 故障描述
	 */
	private String errorDescribe;

	private String errorDescribeFuzzy;

	/**
	 * 维修状态
	 */
	private Integer repairStatus;

}