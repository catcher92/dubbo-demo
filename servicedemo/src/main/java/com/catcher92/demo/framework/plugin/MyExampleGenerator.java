package com.catcher92.demo.framework.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * Created by catcher92 on 2017/2/9.
 */
public class MyExampleGenerator extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.setSuperClass("com.catcher92.demo.framework.bean.BaseExample");
        topLevelClass.addImportedType("com.catcher92.demo.framework.bean.BaseExample");
        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }
}
