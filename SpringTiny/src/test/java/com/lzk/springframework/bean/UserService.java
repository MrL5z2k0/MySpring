package com.lzk.springframework.bean;

/**
 * @author lzk
 * @create 2021-08-15 16:06
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(" ").append(name);
        return sb.toString();
    }

}
