package Servlet;

import Service.LogicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ziheng on 2017/8/11.
 */
@WebServlet("/insertServlets")
public class insertServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String COMMAND=request.getParameter("command");
        String DESCRIPTION=request.getParameter("description");
        String CONTEND=request.getParameter("contends");
        System.out.println(COMMAND);
        LogicService logicService=new LogicService();
        if(logicService.insertInfo(COMMAND,DESCRIPTION,CONTEND)){
                request.getRequestDispatcher("success.jsp").forward(request,response);

        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
