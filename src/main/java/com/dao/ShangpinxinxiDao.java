package com.dao;

import com.entity.ShangpinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinxinxiVO;
import com.entity.view.ShangpinxinxiView;


/**
 * 商品信息
 * 
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface ShangpinxinxiDao extends BaseMapper<ShangpinxinxiEntity> {
	
	List<ShangpinxinxiVO> selectListVO(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);
	
	ShangpinxinxiVO selectVO(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);
	
	List<ShangpinxinxiView> selectListView(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);

	List<ShangpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);
	
	ShangpinxinxiView selectView(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);
	

}
