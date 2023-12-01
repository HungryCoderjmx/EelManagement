package com.ele.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;;


/**
 * @Description:
 * @author:null
 * @Date:2023-08-26T19:40:05.316438
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EleInfo implements Serializable {
	/**
	 * 索引
	 */
	private Integer id;

	/**
	 * 电桩编号
	 */
	private String number;

	/**
	 * 电桩类别
	 */
	private String type;

	/**
	 * 图片
	 */
	private String imagePath;

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

	/**
	 * 每时单价
	 */
	private Integer moneyH;

	/**
	 * 使用方式
	 */
	private String useWay;

	/**
	 * 注意事项
	 */
	private String tips;

	/**
	 * 报修时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date reportTime;

	/**
	 * 故障描述
	 */
	private String errorDescribe;

	/**
	 * 维修状态
	 */
	private Integer repairStatus;

}