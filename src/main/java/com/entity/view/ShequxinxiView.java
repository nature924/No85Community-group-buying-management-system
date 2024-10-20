package com.entity.view;

import com.entity.ShequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-08 15:26:09
 */
@TableName("shequxinxi")
public class ShequxinxiView  extends ShequxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequxinxiView(){
	}
 
 	public ShequxinxiView(ShequxinxiEntity shequxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shequxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
