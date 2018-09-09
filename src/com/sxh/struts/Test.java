package com.sxh.struts;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;

/**
 * Created by SXH on 2018/9/4.
 * process:
 *  1.创建struts2 project
 *  2.编写测试类
 *  3.编写struts.xml
 */
public class Test extends ActionSupport{
    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        System.out.println("Action 执行！");
        return SUCCESS;
    }
    public String add(){
        System.out.println("add 执行");
        request.setAttribute("path","update");
        return "add";
    }
    public String update(){
        System.out.println("update 执行");
        return "update";
    }
}
