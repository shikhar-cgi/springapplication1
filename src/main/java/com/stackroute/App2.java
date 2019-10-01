package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App2 {

    public static void main(String[] agrs) {
        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie s1 = context.getBean("movie1", Movie.class);
        Movie s2 = context.getBean("movie1", Movie.class);

        if(s1==s2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
