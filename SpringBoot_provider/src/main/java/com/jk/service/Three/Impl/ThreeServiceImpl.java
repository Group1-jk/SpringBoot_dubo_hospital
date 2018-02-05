package com.jk.service.Three.Impl;

import com.alibaba.fastjson.JSONObject;
import com.jk.dao.Three.ThreeMapper;
import com.jk.model.Three.Three;
import com.jk.service.Three.ThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThreeServiceImpl implements ThreeService {

	@Autowired
	ThreeMapper threeMapper;

	/**
	 * 一级目录
	 */
	@Override
	public List queryOne() {
		
		return threeMapper.queryOne();
	}


	@Override
	public List queryTwo(Integer ids) {
		
		return threeMapper.queryTwo(ids);
	}


	@Override
	public String querythree(Integer pageSize, Integer start, Three three) {
		long count=threeMapper.findThreeCount(three);//查询总条数

		List<Three> list= threeMapper.findThree(start,pageSize,three);//查询

		JSONObject json=new JSONObject();
		json.put("total", count);
		json.put("rows", list);
		return json.toString();
	}

	//查看三级目录后台
	@Override
	public List<Three> asyncTreeList(Three three) {
		List<Three> list =new ArrayList<Three>(); 
		if(three.getId()!=null && !"".equals(three.getId())){
			list = threeMapper.queryThreeList(three);
		}else{
			list=threeMapper.asyncThreeList(three);
		}
		List<Three> asyncList =new ArrayList<Three>();
        for (Three tree2 : list) {
			if(isHaveChild(tree2)){
				tree2.setIsParent("true");
			}
			asyncList.add(tree2);
		}		
		return asyncList;
	}


	private boolean isHaveChild(Three tree2) {
		boolean flag =false;
		 try {
			List<Three> queryTreeList = threeMapper.queryThreeList(tree2);
			if(queryTreeList.size()>0){
				flag=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return flag;
	}

	//修改
	@Override
	public void updateAfterSave(Three three) {
		
		int g = threeMapper.updateByPrimaryKeySelective(three);
	}

	//删除
	@Override
	public void deleteThree(Three three) {
		Integer id = three.getId();
		int g = threeMapper.deleteByPrimaryKey(id);
	}

	//新增科室
	@Override
	public void addAfterSave(Three three) {
		int gg= threeMapper.insertSelective(three);
		
	}

	//新增子科室
	@Override
	public void toaddAfterSave(Three three) {
		
		int gg= threeMapper.toinsertSelective(three);
	}
	
	
	
	
	
	
	
	
	
}
