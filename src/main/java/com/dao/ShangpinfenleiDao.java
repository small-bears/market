package com.dao;

import com.entity.ShangpinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinfenleiVO;
import com.entity.view.ShangpinfenleiView;


/**
 * 商品分类
 * 
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface ShangpinfenleiDao extends BaseMapper<ShangpinfenleiEntity> {
	
	List<ShangpinfenleiVO> selectListVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	
	ShangpinfenleiVO selectVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	
	List<ShangpinfenleiView> selectListView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

	List<ShangpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	
	ShangpinfenleiView selectView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	

}
