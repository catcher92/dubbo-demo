package com.catcher92.demo.service;

import com.catcher92.demo.framework.bean.Page;
import com.catcher92.demo.po.DepartmentPo;

import java.util.List;

/**
 * Created by caoxuedong on 2017/2/14.
 */
public interface DepartmentService {

    public DepartmentPo save(DepartmentPo deptPo);

    public int updateSelective(DepartmentPo deptPo);

    public DepartmentPo findById(Long id);

    public List<DepartmentPo> findByPo(DepartmentPo departmentPo);

    public Page<DepartmentPo> findPage(DepartmentPo po, Page<DepartmentPo> page);
}
