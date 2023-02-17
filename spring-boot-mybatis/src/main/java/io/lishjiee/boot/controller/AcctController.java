package io.lishjiee.boot.controller;

import io.lishjiee.boot.pojo.AcctInf;
import io.lishjiee.boot.services.AcctServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/acct")
public class AcctController {
    @Autowired
    AcctServices acctService;

    public List<AcctInf> getAllAcct(){
        return acctService.getAllAcct();
    }
}
