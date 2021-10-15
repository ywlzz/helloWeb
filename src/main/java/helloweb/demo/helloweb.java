package helloweb.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class helloweb {
    @RequestMapping("/hello")
    public String web() {
        String result = "helloworld Spring Boot！";
        return result;
    }
}
