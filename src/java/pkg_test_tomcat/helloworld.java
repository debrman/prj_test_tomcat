package pkg_test_tomcat;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class helloworld extends HttpServlet {
    
public void doGet (HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException
{
PrintWriter out = res.getWriter();//Создаем поток вывода
out.println("<html>");
out.println("<head>");
out.println("<title>");
out.println("Hello World Page");//Заголовок страницы
out.println("</title>");
out.println("</head>");
out.println("<body>");
out.println("<center>");
out.println("Hello, world!");//Выводим видимую чсть HTML
out.println("</center>");
out.println("</body>");
out.println("</html>");
out.close();//Закрываем поток вывода
}
}

// prj_test_tomcat = HelloWorld
// pkg_test_tomcat = helloworld
// helloworld = HelloWorld
// http://localhost:8080/HelloWorld/hello/
// http://localhost:8080/prj_test_tomcat/hello/
// helloworld.HelloWorld
// pkg_test_tomcat.prj_test_tomcat
// pkg_test_tomcat.helloworld