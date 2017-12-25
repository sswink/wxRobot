package db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by ziheng on 2017/8/7.
 */
public class DBAccess {
    public SqlSession getSqlSession() throws IOException{
        Reader reader=Resources.getResourceAsReader("config/DBconfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }


    public static void main(String[] args) {
        DBAccess dbAccess=new DBAccess();
        try {
            dbAccess.getSqlSession();
            System.out.println("连接成功");
            SqlSession sqlSession=null;
            sqlSession=dbAccess.getSqlSession();
            System.out.println(sqlSession.selectList("Message.queryMessageList"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
