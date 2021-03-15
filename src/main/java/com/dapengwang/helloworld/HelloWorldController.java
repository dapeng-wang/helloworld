package com.dapengwang.helloworld;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	@ResponseBody
	public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) throws UnknownHostException {
		String origin = InetAddress.getLocalHost().getHostAddress();
		return new Greeting(counter.incrementAndGet(), String.format(template, name), origin);
	}

}
