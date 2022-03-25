package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImple;

public class App1 
{
    public static void main( String[] args )
    {
        System.out.println( "<!-- jdbcTemplate is predefine class in spring (ref=ds) all jdbc data info come in jdbcTemplate" );
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		StudentDao std=ac.getBean("studentDaoImp",StudentDao.class);
		Student ss=new Student(1,"Abhi");
		
		std.insert(ss);
 
    }
}
/*JdbcTemplate class :-
It is the central class in the Spring JDBC support classes. It takes care of creation and release of resources such as 
creating and closing of connection object etc. So it will not lead to any problem if you forget to close the connection.
i)We can perform all the database operations by the help of JdbcTemplate class such as 
ii) insertion, updation, deletion and retrieval of the data from the database.*/