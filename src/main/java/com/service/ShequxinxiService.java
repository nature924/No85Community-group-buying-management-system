package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequxinxiView;


/**
 * 社区信息
 *
 * @author 
 * @email 
 * @date 2023-05-08 15:26:09
 */
public interface ShequxinxiService extends IService<ShequxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequxinxiVO> selectListVO(Wrapper<ShequxinxiEntity> wrapper);
   	
   	ShequxinxiVO selectVO(@Param("ew") Wrapper<ShequxinxiEntity> wrapper);
   	
   	List<ShequxinxiView> selectListView(Wrapper<ShequxinxiEntity> wrapper);
   	
   	ShequxinxiView selectView(@Param("ew") Wrapper<ShequxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequxinxiEntity> wrapper);
   	

}

