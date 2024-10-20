package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShequxinxiEntity;
import com.entity.view.ShequxinxiView;

import com.service.ShequxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 社区信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-08 15:26:09
 */
@RestController
@RequestMapping("/shequxinxi")
public class ShequxinxiController {
    @Autowired
    private ShequxinxiService shequxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequxinxiEntity shequxinxi,
		HttpServletRequest request){
        EntityWrapper<ShequxinxiEntity> ew = new EntityWrapper<ShequxinxiEntity>();

		PageUtils page = shequxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequxinxiEntity shequxinxi, 
		HttpServletRequest request){
        EntityWrapper<ShequxinxiEntity> ew = new EntityWrapper<ShequxinxiEntity>();

		PageUtils page = shequxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequxinxiEntity shequxinxi){
       	EntityWrapper<ShequxinxiEntity> ew = new EntityWrapper<ShequxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequxinxi, "shequxinxi")); 
        return R.ok().put("data", shequxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequxinxiEntity shequxinxi){
        EntityWrapper< ShequxinxiEntity> ew = new EntityWrapper< ShequxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequxinxi, "shequxinxi")); 
		ShequxinxiView shequxinxiView =  shequxinxiService.selectView(ew);
		return R.ok("查询社区信息成功").put("data", shequxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequxinxiEntity shequxinxi = shequxinxiService.selectById(id);
        return R.ok().put("data", shequxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequxinxiEntity shequxinxi = shequxinxiService.selectById(id);
        return R.ok().put("data", shequxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequxinxiEntity shequxinxi, HttpServletRequest request){
    	shequxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequxinxi);
        shequxinxiService.insert(shequxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequxinxiEntity shequxinxi, HttpServletRequest request){
    	shequxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequxinxi);
        shequxinxiService.insert(shequxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShequxinxiEntity shequxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequxinxi);
        shequxinxiService.updateById(shequxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
