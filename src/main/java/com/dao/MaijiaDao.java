package com.dao;

import com.entity.MaijiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MaijiaVO;
import com.entity.view.MaijiaView;


/**
 * 卖家
 * 
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface MaijiaDao extends BaseMapper<MaijiaEntity> {
	
	List<MaijiaVO> selectListVO(@Param("ew") Wrapper<MaijiaEntity> wrapper);
	
	MaijiaVO selectVO(@Param("ew") Wrapper<MaijiaEntity> wrapper);
	
	List<MaijiaView> selectListView(@Param("ew") Wrapper<MaijiaEntity> wrapper);

	List<MaijiaView> selectListView(Pagination page,@Param("ew") Wrapper<MaijiaEntity> wrapper);
	
	MaijiaView selectView(@Param("ew") Wrapper<MaijiaEntity> wrapper);
	

}
