package Servlet;

import Service.LogicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ziheng on 2017/8/9.
 */
@WebServlet("/deleteServlets")
public class deleteServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        LogicService logic=new LogicService();
        String action=request.getParameter("action");
        if(action.equals("deleteone")) {
            if (logic.deleteOne(request, response)) {
                request.getRequestDispatcher("/winServlets").forward(request, response);
            }
        }
        if(action.equals("deleteBatch")) {
            if(logic.deleteBatch(request.getParameterValues("iid"))){
                request.getRequestDispatcher("/winServlets").forward(request,response);
            }
        }
    }
}
