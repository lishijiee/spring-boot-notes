package io.lishijiee.boot.services;

import io.lishijiee.boot.mapper.AcctInfMapper;
import io.lishijiee.boot.pojo.AcctInf;
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
