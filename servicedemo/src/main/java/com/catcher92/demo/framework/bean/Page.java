package com.catcher92.demo.framework.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by caoxuedong on 2017/2/14.
 */
public class Page<Entity> implements Serializable{

    private static final long serialVersionUID = 2070906039675769928L;

    // 用户输入查询条件
    // 当前页码
    private int pageNo = 1;
    // 每页数量
    private int pageSize = 20;

    // 总行数
    private long total;

    // 返回内容
    private List<Entity> list;

    private String orderBy;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public List<Entity> getList() {
        return list;
    }

    public void setList(List<Entity> list) {
        this.list = list;
    }
}
