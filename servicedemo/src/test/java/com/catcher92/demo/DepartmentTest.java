package com.catcher92.demo;

import com.catcher92.demo.framework.bean.Page;
import com.catcher92.demo.framework.constant.DBConstant;
import com.catcher92.demo.po.DepartmentPo;
import com.catcher92.demo.service.DepartmentService;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by caoxuedong on 2017/2/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/springConfig.xml")
public class DepartmentTest {

    @Autowired
    private DepartmentService departmentService;

    @Test
    public void testSave() {
        DepartmentPo po = new DepartmentPo();
        po.setName("系统管理员");
        po.setCreateBy("caoxuedong");
        po.setCreateDate(new Date());
        po.setDeleteStatus(DBConstant.COMMONS_DELETE_STATUS_NO);
        DepartmentPo departmentPo = departmentService.save(po);
        Assert.assertEquals(new Long(1), departmentPo.getId());
    }

    @Test
    public void testAdd(){
        for (int i = 0; i<100; i++) {
            DepartmentPo po = new DepartmentPo();
            po.setName("测试"+i);
            po.setCreateBy("测试"+i);
            po.setCreateDate(new Date());
            if (i>0 && i%3 == 0) {
                po.setDeleteStatus(DBConstant.COMMONS_DELETE_STATUS_YES);
            } else {
                po.setDeleteStatus(DBConstant.COMMONS_DELETE_STATUS_NO);
            }
            departmentService.save(po);
        }
    }

    @Test
    public void testFindByPo() {
        DepartmentPo departmentPo = new DepartmentPo();
        departmentPo.setName("测试");
        departmentPo.setDeleteStatus(DBConstant.COMMONS_DELETE_STATUS_YES);
        List<DepartmentPo> poList = departmentService.findByPo(departmentPo);
        for (DepartmentPo po : poList) {
            System.out.println(po.getName());
        }
    }

    @Test
    public void testPage() {
        Page<DepartmentPo> page = new Page<>();
        page.setPageNo(2);
        page.setPageSize(5);
        page.setOrderBy("create_date desc,id desc");
        DepartmentPo po = new DepartmentPo();
        po.setDeleteStatus(DBConstant.COMMONS_DELETE_STATUS_YES);
        Page<DepartmentPo> departmentPoPage = departmentService.findPage(po, page);
        List<DepartmentPo> list = departmentPoPage.getList();
        for (int i = 0, size = list.size(); i < size; i++) {
            System.out.println(list.get(i).getId()+"~~~~"+list.get(i).getName());
        }
    }

    @Test
    public void testFind() {
        DepartmentPo departmentPo = departmentService.findById(1L);
        Assert.assertEquals(new String("系统管理员"), departmentPo.getName());
    }
}
