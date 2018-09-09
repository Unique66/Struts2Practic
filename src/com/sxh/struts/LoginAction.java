package com.sxh.struts;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by SXH on 2018/9/9.
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    public String login(){
        System.out.println(user.getUsername());
        System.out.println(user.getBookList().get(0));
        System.out.println(user.getBookList().get(1));
//        if(user.getUsername() == null ||
//                "".equals(user.getUsername())){
//            this.addFieldError("username","用户名不能为空");
//            return INPUT;
//        }
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public void validate() {//自动跳转INPUT
        if(user.getUsername() == null ||
                "".equals(user.getUsername())){
            this.addFieldError("username","用户名不能为空");
        }
    }
}
