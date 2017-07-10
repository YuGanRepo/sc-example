package cn.yucode.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Gan on 2017/7/10.
 */
@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/current")
    public Principal getUser(Principal principal) {
        return principal;
    }

}
