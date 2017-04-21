package com.demo.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Greeting;

@RestController
public class HelloWorldController {

    private static final String template = "Hello, %s!";
   
    @RequestMapping(value="/hello" ,method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(1, String.format(template, name));
    }
    
    @RequestMapping(value="/getListdata",method=RequestMethod.GET)
    public List<Integer> getListdata() {
    	List<Integer> dataPointsList = new ArrayList<Integer>();
    	dataPointsList.add(1);
    	dataPointsList.add(2);
    	dataPointsList.add(3);
    	dataPointsList.add(4);
        return dataPointsList;
       
    }

}