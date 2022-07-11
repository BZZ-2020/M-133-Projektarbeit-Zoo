package dev.muetzilla.m133projektarbeitzoo.model;

public class User {
    private String userUUID;
    private String username;
    private String password;
    private String role;
    private String recoverySentence;

    /**
     * Default constructor
     */
    public User(){

    }

    /**
     *
     * @param userUUID  of a user
     * @param username of a user
     * @param password for a user hashed with SHA256
     * @param role the user has
     */
    public User(String userUUID, String username, String password, String role, String recoverySentence) {
        this.userUUID = userUUID;
        this.username = username;
        this.password = password;
        this.role = role;
        this.recoverySentence = recoverySentence;
    }

    /**
     * gets userUUID
     *
     * @return value of userUUID
     */

    public String getUserUUID() {
        return userUUID;
    }

    /**
     * sets userUUID
     *
     * @param userUUID the value to set
     */

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    /**
     * gets username
     *
     * @return value of username
     */

    public String getUsername() {
        return username;
    }

    /**
     * sets username
     *
     * @param username the value to set
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * gets password
     *
     * @return value of password
     */

    public String getPassword() {
        return password;
    }

    /**
     * sets password
     *
     * @param password the value to set
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * gets role
     *
     * @return value of role
     */

    public String getRole() {
        return role;
    }

    /**
     * sets role
     *
     * @param role the value to set
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     *
     * @return the recovery sentence of for an user
     */
    public String getRecoverySentence() {
        return recoverySentence;
    }


    /**
     *
     * @param recoverySentence the sentence used for 2FA
     */
    public void setRecoverySentence(String recoverySentence) {
        this.recoverySentence = recoverySentence;
    }
}
