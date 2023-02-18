package io.lishjiee.boot.controller;

import io.lishjiee.boot.pojo.AcctInf;
import io.lishjiee.boot.services.AcctServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AcctController {
    @Autowired
    AcctServices acctService;
    @RequestMapping("/getAll")
    public List<AcctInf> getAllAcct(){
        return acctService.getAllAcct();
    }
}
