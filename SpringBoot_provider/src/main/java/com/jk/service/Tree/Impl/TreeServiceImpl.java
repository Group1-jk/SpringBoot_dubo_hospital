package com.jk.service.Tree.Impl;

import com.jk.dao.Tree.TreeMapper;
import com.jk.model.Tree.Tree;
import com.jk.service.Tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;
    @Override
    public List<Tree> findTree(int i) {

        return treeMapper.findTree(i);
    }
}
