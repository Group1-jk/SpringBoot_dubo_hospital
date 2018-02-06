package com.jk.dao.Three;

import com.jk.model.Three.Three;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Three record);

    int insertSelective(Three record);
    
    /**
     * <pre>toinsertSelective(新增子科室)   
     * 创建人：段浩 1261131109@qq.com     
     * 创建时间：2018年1月26日 下午5:06:11    
     * 修改人：段浩 1261131109@qq.com   
     * 修改时间：2018年1月26日 下午5:06:11    
     * 修改备注： 
     * @param three
     * @return</pre>
     */
    int toinsertSelective(Three three);

    Three selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Three record);

    int updateByPrimaryKey(Three record);
    
    /**
     * <pre>queryOne(一级目录)   
     * 创建人：段浩 1261131109@qq.com     
     * 创建时间：2018年1月24日 下午4:53:36    
     * 修改人：段浩 1261131109@qq.com   
     * 修改时间：2018年1月24日 下午4:53:36    
     * 修改备注： 
     * @return</pre>
     */
	List queryOne();
	
	/**
	 * <pre>queryTwo(二级目录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午4:53:46    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午4:53:46    
	 * 修改备注： 
	 * @param id
	 * @return</pre>
	 */
	
	List queryTwo(Integer id);
	/**
	 * <pre>findThreeCount(three总条数)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午10:19:57    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午10:19:57    
	 * 修改备注： 
	 * @param three
	 * @return</pre>
	 */
	long findThreeCount(@Param("three") Three three);
	/**
	 * <pre>findThree(three分页)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月24日 下午10:20:27    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月24日 下午10:20:27    
	 * 修改备注： 
	 * @param start
	 * @param
	 * @param three
	 * @return</pre>
	 */
	List<Three> findThree(@Param("start") Integer start, @Param("endPos") Integer endPos, @Param("three") Three three);
	
	/**
	 * <pre>queryThreeList(子节点查询)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午1:52:36    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午1:52:36    
	 * 修改备注： 
	 * @param tree2
	 * @return</pre>
	 */
	List<Three> queryThreeList(Three tree2);

	/**
	 * <pre>asyncThreeList(父节点查询)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月26日 下午1:52:56    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月26日 下午1:52:56    
	 * 修改备注： 
	 * @param three
	 * @return</pre>
	 */
	List<Three> asyncThreeList(Three three);

}