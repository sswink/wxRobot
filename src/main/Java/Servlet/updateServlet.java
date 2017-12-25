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
 * Created by ziheng on 2017/8/15.
 */
@WebServlet("/updateServlets")
public class updateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action=request.getParameter("action");
        if(action.equals("redo")){
            String id=request.getParameter("ids");
            String command=request.getParameter("command");
            String description=request.getParameter("description");
            updateService updateservice=new updateService();
            updateservice.update(command,description,id);
            request.getRequestDispatcher("/updatewinServlets").forward(request,response);
        }
        if(action.equals("deleteOne")){
            String contend_id=request.getParameter("contend_id");
            updateService updateservices=new updateService();
            updateservices.deleteOne(contend_id);
            request.getRequestDispatcher("/updatewinServlets").forward(request,response);
        }
        if(action.equals("insert")){
            String contends=request.getParameter("contend");
            String commandID=request.getParameter("ids");
            updateService updateservice=new updateService();
            updateservice.insertcontend(contends,commandID);
            request.getRequestDispatcher("/updatewinServlets").forward(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
