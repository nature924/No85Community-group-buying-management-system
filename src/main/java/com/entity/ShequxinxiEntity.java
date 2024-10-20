package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 社区信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-08 15:26:09
 */
@TableName("shequxinxi")
public class ShequxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShequxinxiEntity() {
		
	}
	
	public ShequxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 社区名称
	 */
					
	private String shequmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：社区名称
	 */
	public void setShequmingcheng(String shequmingcheng) {
		this.shequmingcheng = shequmingcheng;
	}
	/**
	 * 获取：社区名称
	 */
	public String getShequmingcheng() {
		return shequmingcheng;
	}
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
