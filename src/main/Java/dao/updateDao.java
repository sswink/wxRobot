package dao;

import bean.Command;
import bean.CommandContend;
import db.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ziheng on 2017/8/16.
 */
public class updateDao {
    DBAccess dbAccess=new DBAccess();
    SqlSession sqlSession=null;
    public void deleteOne(String id){
        try {
            sqlSession=dbAccess.getSqlSession();
            sqlSession.delete("Message.deleteContent",id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void update(String command,String description,Integer id){
        try {
            sqlSession=dbAccess.getSqlSession();
            Command commands=new Command();
            commands.setName(command);
            commands.setDescription(description);
            commands.setId(id);
            sqlSession.update("Message.update",commands);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void insert(List<CommandContend> contendList){
        try {
            sqlSession=dbAccess.getSqlSession();
            sqlSession.insert("updateInsert",contendList);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
