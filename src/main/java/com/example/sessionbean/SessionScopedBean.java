package com.example.sessionbean;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;

@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class SessionScopedBean {
    public String message;

    public Date createDate;

    public SessionScopedBean() {
        createDate = new Date();
    }
    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Date getCreateDate() {
        return createDate;
    }

}
