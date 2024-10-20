package com.dao;

import com.entity.ShequxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequxinxiVO;
import com.entity.view.ShequxinxiView;


/**
 * 社区信息
 * 
 * @author 
 * @email 
 * @date 2023-05-08 15:26:09
 */
public interface ShequxinxiDao extends BaseMapper<ShequxinxiEntity> {
	
	List<ShequxinxiVO> selectListVO(@Param("ew") Wrapper<ShequxinxiEntity> wrapper);
	
	ShequxinxiVO selectVO(@Param("ew") Wrapper<ShequxinxiEntity> wrapper);
	
	List<ShequxinxiView> selectListView(@Param("ew") Wrapper<ShequxinxiEntity> wrapper);

	List<ShequxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShequxinxiEntity> wrapper);
	
	ShequxinxiView selectView(@Param("ew") Wrapper<ShequxinxiEntity> wrapper);
	

}
