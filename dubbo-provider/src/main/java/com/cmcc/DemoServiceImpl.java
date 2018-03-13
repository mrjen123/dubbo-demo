package com.cmcc;

import com.cmcc.api.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by cmcc on 18-3-12.
 */

@Service("demoService")
public class DemoServiceImpl implements DemoService {


    public String sayHello(String name) {
        System.out.println("DemoServiceImpl.sayHello");
        System.out.println("name = " + name);
        return name + "hello";
    }


}
