package com.entity.vo;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-08 15:26:09
 */
public class ShangpinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 上架日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjiariqi;
		
	/**
	 * 商品介绍
	 */
	
	private String shangpinjieshao;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 商铺编号
	 */
	
	private String shangpubianhao;
		
	/**
	 * 商铺名称
	 */
	
	private String shangpumingcheng;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 团购价
	 */
	
	private Float groupprice;
		
	/**
	 * 拼团人数
	 */
	
	private Integer grouppeople;
		
	/**
	 * 当前人数
	 */
	
	private Integer curpeople;
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：上架日期
	 */
	 
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
				
	
	/**
	 * 设置：商品介绍
	 */
	 
	public void setShangpinjieshao(String shangpinjieshao) {
		this.shangpinjieshao = shangpinjieshao;
	}
	
	/**
	 * 获取：商品介绍
	 */
	public String getShangpinjieshao() {
		return shangpinjieshao;
	}
				
	
	/**
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
				
	
	/**
	 * 设置：商铺编号
	 */
	 
	public void setShangpubianhao(String shangpubianhao) {
		this.shangpubianhao = shangpubianhao;
	}
	
	/**
	 * 获取：商铺编号
	 */
	public String getShangpubianhao() {
		return shangpubianhao;
	}
				
	
	/**
	 * 设置：商铺名称
	 */
	 
	public void setShangpumingcheng(String shangpumingcheng) {
		this.shangpumingcheng = shangpumingcheng;
	}
	
	/**
	 * 获取：商铺名称
	 */
	public String getShangpumingcheng() {
		return shangpumingcheng;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：团购价
	 */
	 
	public void setGroupprice(Float groupprice) {
		this.groupprice = groupprice;
	}
	
	/**
	 * 获取：团购价
	 */
	public Float getGroupprice() {
		return groupprice;
	}
				
	
	/**
	 * 设置：拼团人数
	 */
	 
	public void setGrouppeople(Integer grouppeople) {
		this.grouppeople = grouppeople;
	}
	
	/**
	 * 获取：拼团人数
	 */
	public Integer getGrouppeople() {
		return grouppeople;
	}
				
	
	/**
	 * 设置：当前人数
	 */
	 
	public void setCurpeople(Integer curpeople) {
		this.curpeople = curpeople;
	}
	
	/**
	 * 获取：当前人数
	 */
	public Integer getCurpeople() {
		return curpeople;
	}
			
}
