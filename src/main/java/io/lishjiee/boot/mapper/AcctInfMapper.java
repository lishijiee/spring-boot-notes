package io.lishjiee.boot.mapper;

import io.lishjiee.boot.pojo.AcctInf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
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
