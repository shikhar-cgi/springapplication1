package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App
{
    public static void main(String[] agrs)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie s1=context.getBean("movie1",Movie.class);



    }
}

