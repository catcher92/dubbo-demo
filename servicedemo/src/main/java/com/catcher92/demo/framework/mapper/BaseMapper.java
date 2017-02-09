package com.catcher92.demo.framework.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by catcher92 on 2017/2/9.
 */
public interface BaseMapper<Po, PoExample> {
    long countByExample(PoExample example);

    int deleteByExample(PoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Po record);

    int insertSelective(Po record);

    List<Po> selectByExample(PoExample example);

    Po selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Po record, @Param("example") PoExample example);

    int updateByExample(@Param("record") Po record, @Param("example") PoExample example);

    int updateByPrimaryKeySelective(Po record);

    int updateByPrimaryKey(Po record);
}
