package com.catcher92.demo.framework.plugin;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoxuedong on 2017/2/8.
 */
public class MybatisGenerator {

    public static void main(String[] args) {
        /*需要配置当前项目源码在buildPath中为第一位*/
        String pathSptor = System.getProperty("path.separator");
        String filePath = System.getProperty("java.class.path");
        filePath = filePath.substring(0, filePath.indexOf(pathSptor));
        // filePath = filePath + File.separator + "generator" + File.separator + "generatorConfig.xml";
        // System.out.println(filePath);
        filePath = filePath.substring(0, filePath.lastIndexOf(File.separator))
                + File.separator + "classes" +File.separator +"generator" +File.separator + "generatorConfig.xml";
        System.out.println(filePath);

        File configFile = new File(filePath);
        List<String> warnings = new ArrayList<>();
        boolean override = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config;
        MyBatisGenerator myBatisGenerator;
        DefaultShellCallback shellCallback = new DefaultShellCallback(override);
        try {
            config = cp.parseConfiguration(configFile);
            myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
            myBatisGenerator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (warnings.isEmpty()) {
            System.out.println("生成完成！");
        } else {
            warnings.forEach(e -> System.out.println(e));
        }
    }
}
