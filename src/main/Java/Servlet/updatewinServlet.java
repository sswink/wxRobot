package Servlet;

import Service.updateService;
import bean.Command;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ziheng on 2017/8/16.
 */
@WebServlet("/updatewinServlets")
public class updatewinServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String ids=request.getParameter("ids").trim();
        updateService updateservice=new updateService();
        List<Command> updateList=updateservice.queryMessagebyID(ids);
        request.setAttribute("ids",ids);
        request.setAttribute("updateList",updateList);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
