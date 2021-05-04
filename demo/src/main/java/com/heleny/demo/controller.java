package com.heleny.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class controller {
        @RequestMapping("/")
        public String index() {
                return "Oi fessor!! Heleny Maria Diniz Bessa :)))!";
        }
}
