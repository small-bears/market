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


import com.dao.DiscussqiugouxinxiDao;
import com.entity.DiscussqiugouxinxiEntity;
import com.service.DiscussqiugouxinxiService;
import com.entity.vo.DiscussqiugouxinxiVO;
import com.entity.view.DiscussqiugouxinxiView;

@Service("discussqiugouxinxiService")
public class DiscussqiugouxinxiServiceImpl extends ServiceImpl<DiscussqiugouxinxiDao, DiscussqiugouxinxiEntity> implements DiscussqiugouxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiugouxinxiEntity> page = this.selectPage(
                new Query<DiscussqiugouxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqiugouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiugouxinxiEntity> wrapper) {
		  Page<DiscussqiugouxinxiView> page =new Query<DiscussqiugouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiugouxinxiVO> selectListVO(Wrapper<DiscussqiugouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiugouxinxiVO selectVO(Wrapper<DiscussqiugouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiugouxinxiView> selectListView(Wrapper<DiscussqiugouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiugouxinxiView selectView(Wrapper<DiscussqiugouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
