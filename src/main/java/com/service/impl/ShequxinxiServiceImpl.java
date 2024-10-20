package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShequxinxiDao;
import com.entity.ShequxinxiEntity;
import com.service.ShequxinxiService;
import com.entity.vo.ShequxinxiVO;
import com.entity.view.ShequxinxiView;

@Service("shequxinxiService")
public class ShequxinxiServiceImpl extends ServiceImpl<ShequxinxiDao, ShequxinxiEntity> implements ShequxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequxinxiEntity> page = this.selectPage(
                new Query<ShequxinxiEntity>(params).getPage(),
                new EntityWrapper<ShequxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequxinxiEntity> wrapper) {
		  Page<ShequxinxiView> page =new Query<ShequxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequxinxiVO> selectListVO(Wrapper<ShequxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequxinxiVO selectVO(Wrapper<ShequxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequxinxiView> selectListView(Wrapper<ShequxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequxinxiView selectView(Wrapper<ShequxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
