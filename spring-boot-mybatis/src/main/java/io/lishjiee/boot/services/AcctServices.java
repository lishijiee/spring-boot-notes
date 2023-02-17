package io.lishjiee.boot.services;

import io.lishjiee.boot.mapper.AcctInfMapper;
import io.lishjiee.boot.pojo.AcctInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcctServices {
    @Autowired
    private AcctInfMapper acctInfMapper;

    public List<AcctInf> getAllAcct(){
        return acctInfMapper.getAllAcct();
    }

}
