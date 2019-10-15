package hello.controller;

import hello.dao1.AdminDao;
import hello.dao2.AdminDao2;
import hello.entity.AdminDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private AdminDao2 adminDao2;

    @GetMapping(path = "/find1")
    public @ResponseBody AdminDo getUsers(@RequestParam String userName){
        return adminDao.find(userName);
    }

    @GetMapping(path = "/find2")
    public @ResponseBody AdminDo getUsers2(@RequestParam String userName){
        return adminDao2.find(userName);
    }
}
