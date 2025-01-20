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


import com.dao.DianpuleibieDao;
import com.entity.DianpuleibieEntity;
import com.service.DianpuleibieService;
import com.entity.vo.DianpuleibieVO;
import com.entity.view.DianpuleibieView;

@Service("dianpuleibieService")
public class DianpuleibieServiceImpl extends ServiceImpl<DianpuleibieDao, DianpuleibieEntity> implements DianpuleibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianpuleibieEntity> page = this.selectPage(
                new Query<DianpuleibieEntity>(params).getPage(),
                new EntityWrapper<DianpuleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianpuleibieEntity> wrapper) {
		  Page<DianpuleibieView> page =new Query<DianpuleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianpuleibieVO> selectListVO(Wrapper<DianpuleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianpuleibieVO selectVO(Wrapper<DianpuleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianpuleibieView> selectListView(Wrapper<DianpuleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianpuleibieView selectView(Wrapper<DianpuleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
