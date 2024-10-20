package com.entity.vo;

import com.entity.ShequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 社区信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-08 15:26:09
 */
public class ShequxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 社区地址
	 */
	
	private String shequdizhi;
		
	/**
	 * 社区面积
	 */
	
	private String shequmianji;
		
	/**
	 * 社区户数
	 */
	
	private String shequhushu;
		
	/**
	 * 社区电话
	 */
	
	private String shequdianhua;
				
	
	/**
	 * 设置：社区地址
	 */
	 
	public void setShequdizhi(String shequdizhi) {
		this.shequdizhi = shequdizhi;
	}
	
	/**
	 * 获取：社区地址
	 */
	public String getShequdizhi() {
		return shequdizhi;
	}
				
	
	/**
	 * 设置：社区面积
	 */
	 
	public void setShequmianji(String shequmianji) {
		this.shequmianji = shequmianji;
	}
	
	/**
	 * 获取：社区面积
	 */
	public String getShequmianji() {
		return shequmianji;
	}
				
	
	/**
	 * 设置：社区户数
	 */
	 
	public void setShequhushu(String shequhushu) {
		this.shequhushu = shequhushu;
	}
	
	/**
	 * 获取：社区户数
	 */
	public String getShequhushu() {
		return shequhushu;
	}
				
	
	/**
	 * 设置：社区电话
	 */
	 
	public void setShequdianhua(String shequdianhua) {
		this.shequdianhua = shequdianhua;
	}
	
	/**
	 * 获取：社区电话
	 */
	public String getShequdianhua() {
		return shequdianhua;
	}
			
}
