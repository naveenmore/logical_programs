package com.example.coreJava;

public class MethodOverLoadingLogin {
	void login(String email, long mobNo) {
		System.out.println("Email Id:"+email+"\tMobile No:"+mobNo);
	}
	void login(String usrName, String pswrd) {
		System.out.println("User Name:"+usrName+"\tPassword:"+pswrd);
	}
	public static void main(String[] args) {
		MethodOverLoadingLogin d1= new MethodOverLoadingLogin();
		d1.login("naveenrm36@gmail.com"	, 7411775377l);
		d1.login("Naveen more", "naveen@98");
	}
}
//example we have login page with 2 credentials 