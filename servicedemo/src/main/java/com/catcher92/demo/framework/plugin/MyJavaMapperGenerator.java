package com.catcher92.demo.framework.plugin;

import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator;

/**
 * Created by catcher92 on 2017/2/9.
 */
public class MyJavaMapperGenerator extends JavaMapperGenerator {
    public MyJavaMapperGenerator(){
        super(true);
    }

    @Override
    protected void addCountByExampleMethod(Interface interfaze) {
    }

    @Override
    protected void addDeleteByExampleMethod(Interface interfaze) {
    }

    @Override
    protected void addDeleteByPrimaryKeyMethod(Interface interfaze) {
    }

    @Override
    protected void addInsertMethod(Interface interfaze) {
    }

    @Override
    protected void addInsertSelectiveMethod(Interface interfaze) {
    }

    @Override
    protected void addSelectByExampleWithBLOBsMethod(Interface interfaze) {
    }

    @Override
    protected void addSelectByExampleWithoutBLOBsMethod(Interface interfaze) {
    }

    @Override
    protected void addSelectByPrimaryKeyMethod(Interface interfaze) {
    }

    @Override
    protected void addUpdateByExampleSelectiveMethod(Interface interfaze) {
    }

    @Override
    protected void addUpdateByExampleWithBLOBsMethod(Interface interfaze) {
    }

    @Override
    protected void addUpdateByExampleWithoutBLOBsMethod(Interface interfaze) {
    }

    @Override
    protected void addUpdateByPrimaryKeySelectiveMethod(Interface interfaze) {
    }

    @Override
    protected void addUpdateByPrimaryKeyWithBLOBsMethod(Interface interfaze) {
    }

    @Override
    protected void addUpdateByPrimaryKeyWithoutBLOBsMethod(Interface interfaze) {
    }
}
