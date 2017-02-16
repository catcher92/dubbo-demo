package com.catcher92.demo.framework.service;

import com.catcher92.demo.framework.bean.BaseEntity;
import com.catcher92.demo.framework.bean.BaseExample;
import com.catcher92.demo.framework.bean.Page;
import com.catcher92.demo.framework.mapper.BaseMapper;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by caoxuedong on 2017/2/14.
 */
public class BaseService<Entity extends BaseEntity, Example extends BaseExample> {

    private BaseMapper<Entity, Example> mapper;

    public BaseMapper<Entity, Example> getMapper() {
        return mapper;
    }

    public void setMapper(BaseMapper<Entity, Example> mapper) {
        this.mapper = mapper;
    }

    /**
     * 保存
     */
    public Entity save(Entity entity) {
        mapper.insert(entity);
        return entity;
    }

    /**
     * 保存不为空的数据
     */
    public Entity saveSelective(Entity entity) {
        mapper.insertSelective(entity);
        return entity;
    }

    /**
     * 根据主键删除
     */
    public int deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据条件删除
     */
    public int deleteByExample(Example example) {
        return mapper.deleteByExample(example);
    }

    /**
     * 根据主键直接更新
     */
    public int update(Entity entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    /**
     * 根据主键只更新有值得数据
     */
    public int updateSelective(Entity entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    /**
     * 根据条件批量更新
     */
    public int updateByExample(Entity entity, Example example) {
        return mapper.updateByExample(entity, example);
    }

    public int updateByExampleSelective(Entity entity, Example example) {
        return mapper.updateByExampleSelective(entity, example);
    }

    /**
     * 根据id查
     */
    public Entity getById(Long id){
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 查询全部
     */
    public List<Entity> findAll(Example example){
        return mapper.selectByExample(example);
    }

    /**
     * 分页查询
     */
    public Page<Entity> findPage(Example example, Page<Entity> page){
        com.github.pagehelper.Page pageHelper = PageHelper.startPage(page.getPageNo(), page.getPageSize());
        pageHelper.setOrderBy("id desc");
        if (StringUtils.isNotEmpty(page.getOrderBy())) {
            pageHelper.setOrderBy(page.getOrderBy());
        }
        page.setList(mapper.selectByExample(example));
        page.setTotal(pageHelper.getTotal());
        return page;
    }

    /**
     * 根据条件统计数量
     */
    public long count(Example example) {
        return mapper.countByExample(example);
    }
}
