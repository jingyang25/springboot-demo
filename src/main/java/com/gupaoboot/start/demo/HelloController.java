package com.gupaoboot.start.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/7
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "hello test";
	}
}
