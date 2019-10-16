package hello.controller;

import hello.dao1.AdminDao;
import hello.dao2.AdminDao2;
import hello.dao2.CompanyOrgDao2;
import hello.entity.AdminDo;
import hello.entity.SysCompanyOrgDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private AdminDao2 adminDao2;

    @Autowired
    private CompanyOrgDao2 companyOrgDao2;

    @GetMapping(path = "/find1")
    public @ResponseBody AdminDo getUsers(@RequestParam String userName){
        return adminDao.find(userName);
    }

    @GetMapping(path = "/find2")
    public @ResponseBody AdminDo getUsers2(@RequestParam String userName){
        return adminDao2.find(userName);
    }

    @GetMapping(path = "/find3")
    public @ResponseBody
    SysCompanyOrgDo finds(@RequestParam Long idOwnOrg){
        return companyOrgDao2.findCompanyOrgByOrgId(idOwnOrg);
    }

    @PostMapping(path = "/insert1")
    public String insert1(@RequestBody AdminDo adminDo){
         adminDao.insert(adminDo);
         return "success";
    }

    @PostMapping(path = "/insert2")
    public String insert2(@RequestBody AdminDo adminDo){
        adminDao2.insert(adminDo);
        return "success";
    }

    @PostMapping(path = "/insert3")
    public String insert3(@RequestBody SysCompanyOrgDo sysCompanyOrgDo){
        companyOrgDao2.insert(sysCompanyOrgDo);
        return "success";
    }
}
