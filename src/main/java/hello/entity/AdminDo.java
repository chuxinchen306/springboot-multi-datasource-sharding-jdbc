package hello.entity;

import java.io.Serializable;

public class AdminDo implements Serializable {
    private static final long serialVersionUID = 53806437996019542L;

    private Long userId;

    private String userName;

    private Long idOwnOrg;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getIdOwnOrg() {
        return idOwnOrg;
    }

    public void setIdOwnOrg(Long idOwnOrg) {
        this.idOwnOrg = idOwnOrg;
    }
}

