package com.gupaoboot.start.demo.test;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
/**
 * @author jingyangTan
 * @version $$
 * @since 2020/1/7
 */
@Configurable
public class ConfigrationTest {

	@Bean //单例
	public TestDemo demo(){
		return new TestDemo();
	}
}
