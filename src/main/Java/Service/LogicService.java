package Service;

import bean.CommandContend;
import dao.MessageDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ziheng on 2017/8/9.
 */
public class LogicService {
    public boolean deleteOne(HttpServletRequest request, HttpServletResponse response){
        MessageDao messageDao=new MessageDao();
        String id=request.getParameter("id");
        messageDao.deleteOne(id);
        return true;
    }
    public boolean deleteBatch(String[] ids){
        MessageDao messageDao=new MessageDao();
        List<Integer> idlist=new ArrayList<Integer>();
        for(String s:ids){
            idlist.add(Integer.valueOf(s));
        }
        messageDao.deleteBatch(idlist);
        return true;
    }
    public boolean insertInfo(String NAME,String DESCRIPTION,String CONTEND){
        MessageDao messageDao=new MessageDao();
        String[] cons=CONTEND.split(",");
        List<String> contentList=new ArrayList<String>();
        for(String s:cons){
            contentList.add(s);
        }
        messageDao.insertcomand(NAME,DESCRIPTION,contentList);
        return true;
    }

}
