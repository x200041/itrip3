package cn.itrip.common;

public class Dto {
    private String token; //token字符串

    private Long tokenCreatedDate; //创建时间

    private Long tokenExpiryDate; //失效时间

    private String isLogin; //是否登录成功

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getTokenCreatedDate() {
        return tokenCreatedDate;
    }

    public void setTokenCreatedDate(Long tokenCreatedDate) {
        this.tokenCreatedDate = tokenCreatedDate;
    }

    public Long getTokenExpiryDate() {
        return tokenExpiryDate;
    }

    public void setTokenExpiryDate(Long tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin;
    }

}
