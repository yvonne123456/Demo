package Aee;

import java.security.AccessControlContext;

public class User {
    public static void main(String[] args) {

    }
}


// 这是一个类
class Account {

    //这是一个属性
    private String mobile;

    //这是一个属性
    private String password;

    public Account(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

    public Account() {
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(){
        if(mobile =="14725836920" && password =="123456"){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
    public void logout(){

        if(mobile == "15156922483" || password == "123456"){

            System.out.println("logout");
        } else if(mobile == "110"){
            System.out.println("fail");
        } else{
            System.out.println("GGG");
        }


    }
}

