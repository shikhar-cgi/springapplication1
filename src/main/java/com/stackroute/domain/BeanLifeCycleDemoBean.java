package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean{


    @Override
    public void destroy() throws Exception {
        System.out.println("destroying bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("setting bean afterproperties");
    }
    public void CustomInit()
    {
        System.out.println("custom init");
    }
    public void CustomDestroy()
    {
        System.out.println("custom Destroyed");
    }

}
