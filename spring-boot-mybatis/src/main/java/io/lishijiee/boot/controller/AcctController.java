package io.lishijiee.boot.controller;

import io.lishijiee.boot.pojo.AcctInf;
import io.lishijiee.boot.services.AcctServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AcctController {
    @Autowired
    AcctServices acctService;
    @RequestMapping("/getAll")
    public List<AcctInf> getAllAcct(){
        List list = new ArrayList();
        return acctService.getAllAcct();
    }
}
