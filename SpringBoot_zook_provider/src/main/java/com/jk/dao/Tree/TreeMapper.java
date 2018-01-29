package com.jk.dao.Tree;


import com.jk.model.Tree.Tree;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TreeMapper {
    @ResultType(Tree.class)
    @Select("select * from  t_power   where pid = #{i}")
    List<Tree> findTree(int i);
    // test hanhao
}
