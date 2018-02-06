package com.jk.controller.Three;

import com.alibaba.fastjson.JSON;
import com.jk.model.Three.Three;
import com.jk.service.Three.ThreeService;
import com.jk.util.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("three")
public class ThreeController {

	@Autowired
	ThreeService threeService;
	
	
	
	/**
	 * <pre>asyncTreeList(查看三级目录后台)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 上午11:41:18    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 上午11:41:18    
	 * 修改备注： 
	 * @param
	 * @param request
	 * @return</pre>
	 */
    @RequestMapping("asyncTreeList")
    @ResponseBody
    public List<Three> asyncTreeList(Three three, HttpServletRequest request) {
    	List<Three> list  =new ArrayList<Three>();
    	list = threeService.asyncTreeList(three);
    	return list;
    }
    /**
     * <pre>updateAfterSave(修改)   
     * 创建人：段浩 1261131109@qq.com     
     * 创建时间：2018年1月26日 下午3:02:32    
     * 修改人：段浩 1261131109@qq.com   
     * 修改时间：2018年1月26日 下午3:02:32    
     * 修改备注： 
     * @param three
     * @return</pre>
     */
	@RequestMapping("updateAfterSave")
	@ResponseBody
	public Three updateAfterSave(Three three){
		
		try {
			threeService.updateAfterSave(three);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return three;
	}
	
	/**
	 * <pre>deleteTree(删除)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午3:05:01    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午3:05:01    
	 * 修改备注： 
	 * @param three</pre>
	 */
	@RequestMapping("deleteTree")
	@ResponseBody
	public void deleteTree(Three three){
		try {
			threeService.deleteThree(three);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	
	/**
	 * <pre>addAfterSave(新增科室)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午3:05:22    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午3:05:22    
	 * 修改备注： 
	 * @param </pre>
	 */
    @RequestMapping("addAfterSave")
    @ResponseBody
    public void addAfterSave(Three three){
    	try {
    		threeService.addAfterSave(three);
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
	
    /**
     * <pre>toaddAfterSave(新增子科室)   
     * 创建人：段浩 1261131109@qq.com     
     * 创建时间：2018年1月26日 下午5:04:25    
     * 修改人：段浩 1261131109@qq.com   
     * 修改时间：2018年1月26日 下午5:04:25    
     * 修改备注： 
     * @param three</pre>
     */
    @RequestMapping("toaddAfterSave")
    @ResponseBody
    public void toaddAfterSave(Three three){
    	try {
    		threeService.toaddAfterSave(three);
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
    
	
	
	/**
	 * <pre>querythree(分页查看)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 上午11:39:01    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 上午11:39:01    
	 * 修改备注： 
	 * @param pageSize
	 * @param start
	 * @param three
	 * @return</pre>
	 */
	@RequestMapping("querythree")
	@ResponseBody
	String querythree(Integer pageSize,Integer start,Three three){
		
		return threeService.querythree(pageSize,start,three);
	}
	
	
	/**
	 * <pre>queryOne(查看一级目录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午2:40:23    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午2:40:23    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("queryOne")
	void queryOne(HttpServletResponse response){
		List list = threeService.queryOne();
		String jsonString = JSON.toJSONString(list);
		
		BaseAction.responseWrite(jsonString,response);
	}
	/**
	 * <pre>queryTwo(二级目录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午4:50:57    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午4:50:57    
	 * 修改备注： </pre>
	 */
	@RequestMapping("queryTwo")
	void queryTwo(HttpServletResponse response,Integer ids){
		List list = threeService.queryTwo(ids);
		String jsonString = JSON.toJSONString(list);
		
		BaseAction.responseWrite(jsonString,response);
		
	}
	
	/**
	 * <pre>queryThree(三级目录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午5:23:14    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午5:23:14    
	 * 修改备注： </pre>
	 */
	@RequestMapping("queryThree")
	void queryThree(HttpServletResponse response,Integer ids){
		List list = threeService.queryTwo(ids);
		String jsonString = JSON.toJSONString(list);
		
		BaseAction.responseWrite(jsonString,response);
		
	}
	
	
	
	
	
}
