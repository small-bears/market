package com.entity.view;

import com.entity.QiugouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 求购信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 17:47:31
 */
@TableName("qiugouxinxi")
public class QiugouxinxiView  extends QiugouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiugouxinxiView(){
	}
 
 	public QiugouxinxiView(QiugouxinxiEntity qiugouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qiugouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
