package com.jk.controller.Tree;


import com.jk.model.Tree.Tree;
import com.jk.service.Tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tree")
public class TreeController {
    @Autowired
    private TreeService treeService;


    @RequestMapping("findTree")
    @ResponseBody
    public List<Tree> findTree(){
   // 这是我的树的代码新增的
        List<Tree> list=treeService.findTree(0);

        List<Tree> parentList=setCompleteTree(list);

        return parentList;

    }

    public List<Tree> setCompleteTree(List<Tree> list){

        List<Tree> CompleteTreeList=new ArrayList<Tree>();

        for (Tree Tree : list) {

            int id=Tree.getId();
            List<Tree> clist=treeService.findTree(id);
            if(clist.size()>0){
                // 调用自身的方法
                List<Tree> getchirdMenu = setCompleteTree(clist);
                // 给子节点填充信息
                Tree.setNodes(getchirdMenu);
                // 将值回填进去
                CompleteTreeList.add(Tree);
            }else{
                // 如果不存在值  将值回填到list集合中
                CompleteTreeList.add(Tree);
            }

        }
        return CompleteTreeList;
    }
    //孙彩虹的分支
}
