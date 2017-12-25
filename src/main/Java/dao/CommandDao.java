package dao;

import bean.Command;
import bean.Message;
import db.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ziheng on 2017/8/13.
 */
public class CommandDao {
    DBAccess dbAccess=new DBAccess();
    SqlSession sqlSession=null;
    public List<Command> queryCommandList(String Name, String description,Integer id){
        List<Command> CommandList=new ArrayList<Command>();
        try{
            sqlSession=dbAccess.getSqlSession();
            Command command=new Command();
            command.setName(Name);
            command.setDescription(description);
            command.setId(id);
            CommandList=sqlSession.selectList("Message.Commands",command);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return CommandList;
    }
}
