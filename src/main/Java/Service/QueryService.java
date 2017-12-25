package Service;

import bean.Command;
import bean.CommandContend;
import dao.CommandDao;

import java.util.List;
import java.util.Random;

/**
 * Created by ziheng on 2017/8/12.
 */
public class QueryService {
    public List<Command> queryMessageList(String command, String description){
        CommandDao commandDao=new CommandDao();
        return commandDao.queryCommandList(command,description,null);
    }
    public String queryByCommand(String command){
        CommandDao commandDao=new CommandDao();
        if(command.equals("帮助"))
        {
            List<Command> list=commandDao.queryCommandList(null,null,null);
            StringBuffer b=new StringBuffer();
            for (int i=0;i<list.size();i++){
                b.append("回复：["+list.get(i).getName()+"],"+"查看："+list.get(i).getDescription()+"<br/>");
            }
            return b.toString();
        }
            List<Command> list=commandDao.queryCommandList(command,null,null);
            if(list.size()>0){
                List<CommandContend> commandContends=list.get(0).getContendlist();
                int i=new Random().nextInt(commandContends.size());
                return commandContends.get(i).getContend();
            }
        return "我听不懂你在说什么";
    }
}
