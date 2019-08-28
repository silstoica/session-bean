package com.example.sessionbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeanScopeController {
    @Autowired
    private RequestScopeBean requestScopeBean;

    @Autowired
    private SessionScopedBean sessionScopedBean;

    @RequestMapping("/page_one")
    public String processPageOne(Model model){
        requestScopeBean.setMessage("request bean created " + requestScopeBean.getCreateDate());
        sessionScopedBean.setMessage("session bean created " + sessionScopedBean.getCreateDate());
        model.addAttribute("requestBean",requestScopeBean);
        model.addAttribute("sessionBean",sessionScopedBean);
        return "page_one";
    }

    @RequestMapping("/page_two")
    public String processPageTwo(Model model){
        requestScopeBean.setMessage("request bean created " + requestScopeBean.getCreateDate());
        model.addAttribute("requestBean",requestScopeBean);
        model.addAttribute("sessionBean",sessionScopedBean);
        return "page_two";
    }

}
