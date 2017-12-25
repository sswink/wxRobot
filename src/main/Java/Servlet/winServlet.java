package Servlet;

import Service.QueryService;
import bean.Command;
import bean.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ziheng on 2017/8/7.
 */
@WebServlet("/winServlets")
public class winServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String command=request.getParameter("command");
        String description=request.getParameter("description");
        QueryService queryService=new QueryService();
        List<Command> CommandList=queryService.queryMessageList(command,description);
        System.out.println(CommandList.size());
        request.setAttribute("CommandList",CommandList);
        request.setAttribute("command",command);
        request.setAttribute("description",description);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
