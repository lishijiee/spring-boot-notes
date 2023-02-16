package io.lishjiee.boot.mapper;

import io.lishjiee.boot.pojo.AcctInf;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShowMapper {
    @Select("select * from user")
    List<AcctInf> getAllUsers();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userNo", column = "user_no"),
            @Result(property = "amt", column = "amt")
    })
    @Select("select id, userNo as user_no, amt from acct_inf where id=#{id}")
    AcctInf getAcctInfById(Long id);

}
