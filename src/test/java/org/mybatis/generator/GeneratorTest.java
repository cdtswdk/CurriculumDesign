package org.mybatis.generator;

import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.NullProgressCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis代码生成插件调用者.
 */
public class GeneratorTest {

    @Test
    public void generate() throws Exception {
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(GeneratorTest.class.getClassLoader().getResourceAsStream("generatorConfig.xml"));
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, new DefaultShellCallback(true), warnings);
        System.out.println("------- org.mybatis.generator begin -------");
        File f = new File("././src/main/java");
        f.mkdirs();
        myBatisGenerator.generate(new NullProgressCallback());
        for (String warning : warnings) {
            System.out.println(warning);
        }
        System.out.println("------- org.mybatis.generator end -------");
    }

}
