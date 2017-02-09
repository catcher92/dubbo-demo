package com.catcher92.demo.framework.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

/**
 * Created by catcher92 on 2017/2/9.
 */
public class MyMapperGenerator extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        String baseEntity = introspectedTable.getBaseRecordType();
        String baseExample = baseEntity + "Example";
        String value = "com.catcher92.demo.framework.mapper.BaseMapper<" + baseEntity + ","+ baseExample + ">";
        introspectedTable.getContext().getJavaClientGeneratorConfiguration().addProperty("rootInterface", value);
        introspectedTable.getContext().getSqlMapGeneratorConfiguration().addProperty("rootInterface", value);
    }
}
