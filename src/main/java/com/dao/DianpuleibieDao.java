package com.dao;

import com.entity.DianpuleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianpuleibieVO;
import com.entity.view.DianpuleibieView;


/**
 * 店铺类别
 * 
 * @author 
 * @email 
 * @date 2022-04-10 13:32:24
 */
public interface DianpuleibieDao extends BaseMapper<DianpuleibieEntity> {
	
	List<DianpuleibieVO> selectListVO(@Param("ew") Wrapper<DianpuleibieEntity> wrapper);
	
	DianpuleibieVO selectVO(@Param("ew") Wrapper<DianpuleibieEntity> wrapper);
	
	List<DianpuleibieView> selectListView(@Param("ew") Wrapper<DianpuleibieEntity> wrapper);

	List<DianpuleibieView> selectListView(Pagination page,@Param("ew") Wrapper<DianpuleibieEntity> wrapper);
	
	DianpuleibieView selectView(@Param("ew") Wrapper<DianpuleibieEntity> wrapper);
	

}
