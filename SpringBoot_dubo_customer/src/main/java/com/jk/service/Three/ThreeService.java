package com.jk.service.Three;

import com.jk.model.Three.Three;

import java.util.List;


public interface ThreeService {
	/**
	 * <pre>queryOne(查看一级目录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午10:17:39    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午10:17:39    
	 * 修改备注： 
	 * @return</pre>
	 */
	List queryOne();
	/**
	 * <pre>queryTwo(查看二级目录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午10:17:53    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午10:17:53    
	 * 修改备注： 
	 * @param ids
	 * @return</pre>
	 */
	List queryTwo(Integer ids);
	/**
	 * <pre>querythree(分页查看three)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午10:17:23    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午10:17:23    
	 * 修改备注： 
	 * @param pageSize
	 * @param start
	 * @param three
	 * @return</pre>
	 */
	String querythree(Integer pageSize, Integer start, Three three);
	
	/**
	 * <pre>asyncTreeList(三级目录后台)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 上午11:42:54    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 上午11:42:54    
	 * 修改备注： 
	 * @param three
	 * @return</pre>
	 */
	List<Three> asyncTreeList(Three three);
	
	/**
	 * <pre>updateAfterSave(修改目录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午2:58:08    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午2:58:08    
	 * 修改备注： 
	 * @param three</pre>
	 */
	void updateAfterSave(Three three);
	
	/**
	 * <pre>deleteThree(删除)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午3:04:44    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午3:04:44    
	 * 修改备注： 
	 * @param three</pre>
	 */
	void deleteThree(Three three);
	
	
	/**
	 * <pre>addAfterSave(新增)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午3:06:22    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午3:06:22    
	 * 修改备注： 
	 * @param three</pre>
	 */
	void addAfterSave(Three three);
	
	/**
	 * <pre>toaddAfterSave(新增子科室)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午5:04:56    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午5:04:56    
	 * 修改备注： 
	 * @param three</pre>
	 */
	void toaddAfterSave(Three three);

}
