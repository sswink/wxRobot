package Servlet;

import Service.QueryService;
import bean.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by ziheng on 2017/8/12.
 */
@WebServlet("/reply")
public class replyservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command=request.getParameter("contents");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        QueryService queryService=new QueryService();

        System.out.println(request.getParameter("contents"));
        out.write(queryService.queryByCommand(command));
        out.flush();
        out.close();
    }
}
