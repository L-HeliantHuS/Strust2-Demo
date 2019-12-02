package main.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class Logout {
    public String execute() {
        Map attibutes = ActionContext.getContext().getSession();
        attibutes.clear();
        return ActionSupport.SUCCESS;
    }
}
