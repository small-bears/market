package com.dao;

import com.entity.DiscussqiugouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiugouxinxiVO;
import com.entity.view.DiscussqiugouxinxiView;


/**
 * 求购信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface DiscussqiugouxinxiDao extends BaseMapper<DiscussqiugouxinxiEntity> {
	
	List<DiscussqiugouxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussqiugouxinxiEntity> wrapper);
	
	DiscussqiugouxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiugouxinxiEntity> wrapper);
	
	List<DiscussqiugouxinxiView> selectListView(@Param("ew") Wrapper<DiscussqiugouxinxiEntity> wrapper);

	List<DiscussqiugouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiugouxinxiEntity> wrapper);
	
	DiscussqiugouxinxiView selectView(@Param("ew") Wrapper<DiscussqiugouxinxiEntity> wrapper);
	

}
