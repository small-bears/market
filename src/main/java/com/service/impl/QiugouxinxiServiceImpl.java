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


import com.dao.QiugouxinxiDao;
import com.entity.QiugouxinxiEntity;
import com.service.QiugouxinxiService;
import com.entity.vo.QiugouxinxiVO;
import com.entity.view.QiugouxinxiView;

@Service("qiugouxinxiService")
public class QiugouxinxiServiceImpl extends ServiceImpl<QiugouxinxiDao, QiugouxinxiEntity> implements QiugouxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiugouxinxiEntity> page = this.selectPage(
                new Query<QiugouxinxiEntity>(params).getPage(),
                new EntityWrapper<QiugouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiugouxinxiEntity> wrapper) {
		  Page<QiugouxinxiView> page =new Query<QiugouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiugouxinxiVO> selectListVO(Wrapper<QiugouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiugouxinxiVO selectVO(Wrapper<QiugouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiugouxinxiView> selectListView(Wrapper<QiugouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiugouxinxiView selectView(Wrapper<QiugouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
