package com.gupaoboot.start.demo.testSecond;
import org.springframework.context.annotation.Configuration;
/**
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/7
 */
@Configuration
public class DefaultBean {

	public DefaultBean defaultBean(){
		return new DefaultBean();
	}
}

