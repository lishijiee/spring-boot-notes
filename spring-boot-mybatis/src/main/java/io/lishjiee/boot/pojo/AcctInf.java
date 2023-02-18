package io.lishjiee.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcctInf {
    private String id;
    private String userNo;
    private String acctNo;
    private String amt;
}
