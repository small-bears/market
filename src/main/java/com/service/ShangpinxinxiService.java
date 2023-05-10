package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinxinxiView;


/**
 * 商品信息
 *
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface ShangpinxinxiService extends IService<ShangpinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinxinxiVO> selectListVO(Wrapper<ShangpinxinxiEntity> wrapper);
   	
   	ShangpinxinxiVO selectVO(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);
   	
   	List<ShangpinxinxiView> selectListView(Wrapper<ShangpinxinxiEntity> wrapper);
   	
   	ShangpinxinxiView selectView(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinxinxiEntity> wrapper);
   	

}

