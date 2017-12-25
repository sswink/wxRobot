package Service;

import bean.Command;
import bean.CommandContend;
import dao.CommandDao;
import dao.MessageDao;
import dao.updateDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ziheng on 2017/8/15.
 */
public class updateService {
    public List<Command> queryMessagebyID(String id){
        CommandDao commandDao=new CommandDao();
        List<Command> commandList=commandDao.queryCommandList(null,null,Integer.valueOf(id));
        return commandList;
    }
    public void deleteOne(String commandid){
        updateDao updateDao=new updateDao();
        updateDao.deleteOne(commandid.trim());
    }
    public void update(String command,String description,String id){
        updateDao updateDao=new updateDao();
        updateDao.update(command,description,Integer.parseInt(id.trim()));
    }
    public void insertcontend(String contends,String commandID){
        updateDao updatedao=new updateDao();
        String[] cons=contends.split(",");
        List<String> list=new ArrayList<String>();
        for(String s:cons){
            list.add(s);
        }
        List<CommandContend> contendList=new ArrayList<CommandContend>();
        for(int i=0;i<list.size();i++){
            CommandContend commandContend=new CommandContend();
            commandContend.setCommand_id(Integer.parseInt(commandID.trim()));
            commandContend.setContend(list.get(i));
            contendList.add(commandContend);
        }
        updatedao.insert(contendList);
    }
}
