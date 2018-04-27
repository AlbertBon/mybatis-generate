package com.bon.mybatis.generator.test;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorMybatisHelper {
	
	
	
	public static void generator() {
		URL url = GeneratorMybatisHelper.class.getClassLoader().getResource("generator.xml");
		List<String> warnings = new ArrayList<String>();
		try {
			// 导入配置表mybatis-generator.xml
			File configFile = new File(url.getPath());
			// 解析
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			// 是否覆盖
			DefaultShellCallback dsc = new DefaultShellCallback(true);
			MyBatisGenerator mg = new MyBatisGenerator(config, dsc, warnings);
			mg.generate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeneratorMybatisHelper.generator();
		System.out.println("done!");
		/*URL url = GeneratorMybatisHelper.class.getClassLoader().getResource("mybatis-generator.xml");
		System.out.println(url.getPath());*/
	}

}
