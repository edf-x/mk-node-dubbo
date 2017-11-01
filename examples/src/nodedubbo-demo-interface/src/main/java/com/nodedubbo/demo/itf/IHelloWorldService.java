package com.nodedubbo.demo.itf;
import com.github.lishengguo.dubbo.annotation.RequestMapping;

@RequestMapping("hellow")
public interface IHelloWorldService {

	@RequestMapping("world")
	public String helloWorld();
}
