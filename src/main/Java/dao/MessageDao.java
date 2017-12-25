package dao;

import bean.Command;
import bean.CommandContend;
import bean.Message;
import db.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ziheng on 2017/8/7.
 */
public class MessageDao {
    DBAccess dbAccess=new DBAccess();
    SqlSession sqlSession=null;
    public void deleteOne(String id){
            try {
                sqlSession=dbAccess.getSqlSession();
                sqlSession.delete("Message.deleteOne",id);
                sqlSession.commit();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public void deleteBatch(List<Integer> ids){
        try {
            sqlSession=dbAccess.getSqlSession();
            sqlSession.delete("Message.deleteBatch",ids);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void insertcomand(String Name,String DESCRIPTION,List<String> contents){
        try {
            sqlSession=dbAccess.getSqlSession();
            Command command=new Command();
            command.setName(Name);
            command.setDescription(DESCRIPTION);
            sqlSession.insert("Message.insertOne",command);
            sqlSession.commit();
            int commandIda=command.getId();
            List<CommandContend> commandContendList=new ArrayList<CommandContend>();
            for(int i=0;i<contents.size();i++){
                CommandContend commandContend=new CommandContend();
                commandContend.setCommand_id(commandIda);
                commandContend.setContend(contents.get(i));
                commandContendList.add(commandContend);
            }
            sqlSession.insert("Message.insertContend",commandContendList);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
