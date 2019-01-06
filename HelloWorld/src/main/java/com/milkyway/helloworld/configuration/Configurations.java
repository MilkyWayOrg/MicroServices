package com.milkyway.helloworld.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hello-world-service")
public class Configurations {
private String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

}
