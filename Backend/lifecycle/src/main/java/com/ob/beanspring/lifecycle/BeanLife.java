package com.ob.beanspring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLife implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");

	}

}
