package com.dao;

import com.entity.QiugouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiugouxinxiVO;
import com.entity.view.QiugouxinxiView;


/**
 * 求购信息
 * 
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface QiugouxinxiDao extends BaseMapper<QiugouxinxiEntity> {
	
	List<QiugouxinxiVO> selectListVO(@Param("ew") Wrapper<QiugouxinxiEntity> wrapper);
	
	QiugouxinxiVO selectVO(@Param("ew") Wrapper<QiugouxinxiEntity> wrapper);
	
	List<QiugouxinxiView> selectListView(@Param("ew") Wrapper<QiugouxinxiEntity> wrapper);

	List<QiugouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiugouxinxiEntity> wrapper);
	
	QiugouxinxiView selectView(@Param("ew") Wrapper<QiugouxinxiEntity> wrapper);
	

}
