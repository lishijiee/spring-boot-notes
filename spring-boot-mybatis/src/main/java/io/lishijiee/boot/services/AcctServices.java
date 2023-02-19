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

        List<AcctInf> allAcct = null;
        try {
            allAcct = acctInfMapper.getAllAcct();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return allAcct;
    }

}
