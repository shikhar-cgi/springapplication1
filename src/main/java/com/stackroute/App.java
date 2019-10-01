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
        Movie s2=context.getBean("movie1",Movie.class);
        System.out.println(s1.getShahrukh().getName());
        System.out.println(s1.getShahrukh().getAge());
        System.out.println(s1.getShahrukh().getGender());

        System.out.println(s1.getAmir().getName());
        System.out.println(s1.getAmir().getAge());
        System.out.println(s1.getAmir().getGender());

        System.out.println(s1.getSalman().getName());
        System.out.println(s1.getSalman().getAge());
        System.out.println(s1.getSalman().getGender());

        if(s1==s2)
        {
            System.out.println("true");
        }
    }
}

