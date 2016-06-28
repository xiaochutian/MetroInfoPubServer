package me.xiaochutian.controller;

import java.io.IOException;
import java.util.Map;

import me.xiaochutian.entity.WorningMessage;
import me.xiaochutian.websocket.MyHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import me.xiaochutian.service.HelloWorldService;
import org.springframework.web.socket.TextMessage;

@Controller
public class WelcomeController {

	private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	private final HelloWorldService helloWorldService;

	@Autowired
	public WelcomeController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {

		logger.debug("index() is executed!");

		model.put("title", helloWorldService.getTitle(""));
		model.put("msg", helloWorldService.getDesc());
		
		return "index";
	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		logger.debug("hello() is executed - $name {}", name);

		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		model.addObject("title", helloWorldService.getTitle(name));
		model.addObject("msg", helloWorldService.getDesc());
		
		return model;
	}



	@ResponseBody
	@RequestMapping(value = "/sendData/{data}" , method = RequestMethod.GET)
	public void sendMessage(@PathVariable("data") String data){
		MyHandler.sessionList.forEach(webSocketSession -> {
			try {
				webSocketSession.sendMessage(new TextMessage(data));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}


}