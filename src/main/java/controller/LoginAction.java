package controller;

import model.Authentication;
import model.AuthenticationInterface;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Login Action class
 * Defines our Login logic, handles the client request in the web
 * Prepare the response through our @execute() method. 
 */
public class LoginAction extends ActionSupport {

    private String userName;
    private String password;
    private static final long serialVersionUID = 1L; // Unique Identifier for Serializable classes

    /**
     * Login Action to be implemented
     * Uses AuthenticationInterface As our Model Interface
     */
    @Override
    public String execute() throws Exception {
        AuthenticationInterface authentication = new Authentication();
        if(authentication.isLoginValid(userName, password)){
            return SUCCESS;
        } 
        return INPUT;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
