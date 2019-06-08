package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	@Value("${my.name}")
	private String myname;
	@Value("${my.db.driver}")
	private String dbDriver;
	@Value("${my.db.url}")
	private String dbUrl;
	@Value("${my.db.username}")
	private String dbUsername;
	@Value("${my.db.password}")
	private String dbPassword;
	@Value("${my.email.host}")
	private String emailHost;
	@Value("${my.email.port}")
	private String emailPort;	
	
	
	public String getMyname() {
		return myname;
	}


	public void setMyname(String myname) {
		this.myname = myname;
	}


	public String getDbDriver() {
		return dbDriver;
	}


	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}


	public String getDbUrl() {
		return dbUrl;
	}


	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}


	public String getDbUsername() {
		return dbUsername;
	}


	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}


	public String getDbPassword() {
		return dbPassword;
	}


	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}


	public String getEmailHost() {
		return emailHost;
	}


	public void setEmailHost(String emailHost) {
		this.emailHost = emailHost;
	}


	public String getEmailPort() {
		return emailPort;
	}


	public void setEmailPort(String emailPort) {
		this.emailPort = emailPort;
	}


	@Override
	public String toString() {
		return "AppRunner [myname=" + myname + ", dbDriver=" + dbDriver + ", dbUrl=" + dbUrl + ", dbUsername="
				+ dbUsername + ", dbPassword=" + dbPassword + ", emailHost=" + emailHost + ", emailPort=" + emailPort
				+ "]";
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}
