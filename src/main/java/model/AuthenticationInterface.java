package model;

/**
 * Interface Model for Authentication Interface
 * isLoginValid() validates login credential with localhost SQL 
 */
public interface AuthenticationInterface {
    public abstract boolean isLoginValid(String userName, String password);
}
