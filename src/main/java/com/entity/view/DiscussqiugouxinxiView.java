package com.entity.view;

import com.entity.DiscussqiugouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 求购信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
@TableName("discussqiugouxinxi")
public class DiscussqiugouxinxiView  extends DiscussqiugouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussqiugouxinxiView(){
	}
 
 	public DiscussqiugouxinxiView(DiscussqiugouxinxiEntity discussqiugouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussqiugouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
