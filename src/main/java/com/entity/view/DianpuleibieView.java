package com.entity.view;

import com.entity.DianpuleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 店铺类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 13:32:24
 */
@TableName("dianpuleibie")
public class DianpuleibieView  extends DianpuleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianpuleibieView(){
	}
 
 	public DianpuleibieView(DianpuleibieEntity dianpuleibieEntity){
 	try {
			BeanUtils.copyProperties(this, dianpuleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
