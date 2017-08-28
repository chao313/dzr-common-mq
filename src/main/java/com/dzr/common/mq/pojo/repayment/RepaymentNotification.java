package com.dzr.common.mq.pojo.repayment;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 还款提醒消息
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RepaymentNotification {
    /*还款计划ID*/
    private String planId;
    /*用户ID*/
    private long userId;
    private String phone;

}
