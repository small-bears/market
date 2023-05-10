package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MaijiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MaijiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MaijiaView;


/**
 * 卖家
 *
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
public interface MaijiaService extends IService<MaijiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MaijiaVO> selectListVO(Wrapper<MaijiaEntity> wrapper);
   	
   	MaijiaVO selectVO(@Param("ew") Wrapper<MaijiaEntity> wrapper);
   	
   	List<MaijiaView> selectListView(Wrapper<MaijiaEntity> wrapper);
   	
   	MaijiaView selectView(@Param("ew") Wrapper<MaijiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MaijiaEntity> wrapper);
   	

}

