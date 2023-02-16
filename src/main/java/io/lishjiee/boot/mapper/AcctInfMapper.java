package io.lishjiee.boot.mapper;

import io.lishjiee.boot.pojo.AcctInf;

import java.util.List;

public interface AcctInfMapper {
    //
    List<AcctInf> getAllAcct();
    //
    Integer addAcct(AcctInf acctInf);
    //
    Integer updateAcctById(AcctInf acctInf);
    //
    Integer deleteAcctById(Integer id);

}
