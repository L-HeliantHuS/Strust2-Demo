package main.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class Me {
    private String username;

    public String execute() {

        // 找不到用户名就跳转到Login
        try {
            Map attibutes = ActionContext.getContext().getSession();

            username = attibutes.get("username").toString();
            return ActionSupport.SUCCESS;
        } catch (NullPointerException e) {
            return ActionSupport.LOGIN;
        }
    }

}
