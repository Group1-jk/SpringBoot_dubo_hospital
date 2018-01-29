package com.jk.model.Tree;

import java.io.Serializable;
import java.util.List;

public class Tree implements Serializable {

    private static final long serialVersionUID = -5302364446091161819L;

    private Integer id;

    private String text;

    private String url;

    private Integer pid;
    
    private List<Tree> nodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

	public List<Tree> getNodes() {
		return nodes;
	}

	public void setNodes(List<Tree> nodes) {
		this.nodes = nodes;
	}
}