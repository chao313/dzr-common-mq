package com.dzr.common.mq.pojo.repayment;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * 还款成功消息
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RepaymentSuccess {
    /**
     * 申请编号
     */
    private String applyId;

    /**
     * 放款ID
     */
    private String loanId;

    /**
     * 还款计划ID
     */
    private String planId;

    /**
     * 还款成功时间
     */
    private Date repaymentTime;

    /**
     * 还款银行
     */
    private String bankName;

    /**
     * 还款银行卡号
     */
    private String cardNo;


}