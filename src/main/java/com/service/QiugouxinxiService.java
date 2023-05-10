package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiugouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiugouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiugouxinxiView;


/**
 * 求购信息
 *
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface QiugouxinxiService extends IService<QiugouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiugouxinxiVO> selectListVO(Wrapper<QiugouxinxiEntity> wrapper);
   	
   	QiugouxinxiVO selectVO(@Param("ew") Wrapper<QiugouxinxiEntity> wrapper);
   	
   	List<QiugouxinxiView> selectListView(Wrapper<QiugouxinxiEntity> wrapper);
   	
   	QiugouxinxiView selectView(@Param("ew") Wrapper<QiugouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiugouxinxiEntity> wrapper);
   	

}

