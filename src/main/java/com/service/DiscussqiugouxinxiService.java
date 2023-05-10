package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiugouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiugouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiugouxinxiView;


/**
 * 求购信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface DiscussqiugouxinxiService extends IService<DiscussqiugouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiugouxinxiVO> selectListVO(Wrapper<DiscussqiugouxinxiEntity> wrapper);
   	
   	DiscussqiugouxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiugouxinxiEntity> wrapper);
   	
   	List<DiscussqiugouxinxiView> selectListView(Wrapper<DiscussqiugouxinxiEntity> wrapper);
   	
   	DiscussqiugouxinxiView selectView(@Param("ew") Wrapper<DiscussqiugouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiugouxinxiEntity> wrapper);
   	

}

