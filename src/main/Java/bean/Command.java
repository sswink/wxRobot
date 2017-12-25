package bean;

import java.util.List;

/**
 * Created by ziheng on 2017/8/12.
 */
public class Command {
    private Integer id;
    private String name;
    private String description;
    private List<CommandContend> contendlist;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CommandContend> getContendlist() {
        return contendlist;
    }

    public void setContendlist(List<CommandContend> contendlist) {
        this.contendlist = contendlist;
    }
}
