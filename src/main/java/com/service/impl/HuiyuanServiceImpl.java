package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuiyuanDao;
import com.entity.HuiyuanEntity;
import com.service.HuiyuanService;
import com.entity.vo.HuiyuanVO;
import com.entity.view.HuiyuanView;

@Service("huiyuanService")
public class HuiyuanServiceImpl extends ServiceImpl<HuiyuanDao, HuiyuanEntity> implements HuiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanEntity> page = this.selectPage(
                new Query<HuiyuanEntity>(params).getPage(),
                new EntityWrapper<HuiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanEntity> wrapper) {
		  Page<HuiyuanView> page =new Query<HuiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanVO> selectListVO(Wrapper<HuiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanVO selectVO(Wrapper<HuiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanView> selectListView(Wrapper<HuiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanView selectView(Wrapper<HuiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
