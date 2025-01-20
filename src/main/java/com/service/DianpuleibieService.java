package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianpuleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianpuleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianpuleibieView;


/**
 * 店铺类别
 *
 * @author 
 * @email 
 * @date 2022-04-10 13:32:24
 */
public interface DianpuleibieService extends IService<DianpuleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianpuleibieVO> selectListVO(Wrapper<DianpuleibieEntity> wrapper);
   	
   	DianpuleibieVO selectVO(@Param("ew") Wrapper<DianpuleibieEntity> wrapper);
   	
   	List<DianpuleibieView> selectListView(Wrapper<DianpuleibieEntity> wrapper);
   	
   	DianpuleibieView selectView(@Param("ew") Wrapper<DianpuleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianpuleibieEntity> wrapper);
   	

}

