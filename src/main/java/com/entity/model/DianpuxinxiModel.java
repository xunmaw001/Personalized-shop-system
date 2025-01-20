package com.entity.model;

import com.entity.DianpuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 店铺信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-10 13:32:24
 */
public class DianpuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 店铺名称
	 */
	
	private String dianpumingcheng;
		
	/**
	 * 店铺类别
	 */
	
	private String dianpuleibie;
		
	/**
	 * 店铺照片
	 */
	
	private String dianpuzhaopian;
		
	/**
	 * 店铺区域
	 */
	
	private String dianpuquyu;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 经营范围
	 */
	
	private String jingyingfanwei;
		
	/**
	 * 店铺简介
	 */
	
	private String dianpujianjie;
				
	
	/**
	 * 设置：店铺名称
	 */
	 
	public void setDianpumingcheng(String dianpumingcheng) {
		this.dianpumingcheng = dianpumingcheng;
	}
	
	/**
	 * 获取：店铺名称
	 */
	public String getDianpumingcheng() {
		return dianpumingcheng;
	}
				
	
	/**
	 * 设置：店铺类别
	 */
	 
	public void setDianpuleibie(String dianpuleibie) {
		this.dianpuleibie = dianpuleibie;
	}
	
	/**
	 * 获取：店铺类别
	 */
	public String getDianpuleibie() {
		return dianpuleibie;
	}
				
	
	/**
	 * 设置：店铺照片
	 */
	 
	public void setDianpuzhaopian(String dianpuzhaopian) {
		this.dianpuzhaopian = dianpuzhaopian;
	}
	
	/**
	 * 获取：店铺照片
	 */
	public String getDianpuzhaopian() {
		return dianpuzhaopian;
	}
				
	
	/**
	 * 设置：店铺区域
	 */
	 
	public void setDianpuquyu(String dianpuquyu) {
		this.dianpuquyu = dianpuquyu;
	}
	
	/**
	 * 获取：店铺区域
	 */
	public String getDianpuquyu() {
		return dianpuquyu;
	}
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：经营范围
	 */
	 
	public void setJingyingfanwei(String jingyingfanwei) {
		this.jingyingfanwei = jingyingfanwei;
	}
	
	/**
	 * 获取：经营范围
	 */
	public String getJingyingfanwei() {
		return jingyingfanwei;
	}
				
	
	/**
	 * 设置：店铺简介
	 */
	 
	public void setDianpujianjie(String dianpujianjie) {
		this.dianpujianjie = dianpujianjie;
	}
	
	/**
	 * 获取：店铺简介
	 */
	public String getDianpujianjie() {
		return dianpujianjie;
	}
			
}
