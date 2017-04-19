package com.catcher92.demo.service.impl;

import com.catcher92.demo.framework.bean.Page;
import com.catcher92.demo.framework.service.BaseService;
import com.catcher92.demo.mapper.DepartmentPoMapper;
import com.catcher92.demo.po.DepartmentPo;
import com.catcher92.demo.po.DepartmentPoExample;
import com.catcher92.demo.service.DepartmentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caoxuedong on 2017/2/14.
 */
@Service
public class DepartmentServiceImpl extends BaseService implements DepartmentService{

    @Autowired
    private DepartmentPoMapper deptPoMapper;

    @Autowired
    public void init() {
        super.setMapper(deptPoMapper);
    }

    @Override
    public DepartmentPo save(DepartmentPo deptPo) {
        super.save(deptPo);
        return deptPo;
    }

    @Override
    public int updateSelective(DepartmentPo deptPo) {
        return super.updateSelective(deptPo);
    }

    @Override
    public DepartmentPo findById(Long id) {
        return (DepartmentPo)super.getById(id);
    }

    @Override
    public List<DepartmentPo> findByPo(DepartmentPo departmentPo) {
        DepartmentPoExample example = initExample(departmentPo);
        return super.findAll(example);
    }

    private DepartmentPoExample initExample(DepartmentPo departmentPo) {
        DepartmentPoExample example = new DepartmentPoExample();
        DepartmentPoExample.Criteria criteria = example.createCriteria();
        // id精准查询
        if (null != departmentPo.getId()) {
            criteria.andIdEqualTo(departmentPo.getId());
        } else {
            // 名称模糊查询
            if (StringUtils.isNotBlank(departmentPo.getName())) {
                criteria.andNameLike(new StringBuilder("%").append(departmentPo.getName().trim()).append("%").toString());
            }
            if (null != departmentPo.getDeleteStatus()) {
                criteria.andDeleteStatusEqualTo(departmentPo.getDeleteStatus());
            }
        }
        return example;
    }

    @Override
    public Page<DepartmentPo> findPage(DepartmentPo po, Page<DepartmentPo> page) {
        DepartmentPoExample example = initExample(po);
        return super.findPage(example, page);
    }
}
