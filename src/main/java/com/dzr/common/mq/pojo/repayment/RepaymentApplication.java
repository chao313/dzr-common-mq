package com.dzr.common.mq.pojo.repayment;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 还款成功消息
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RepaymentApplication {
    /**
     * 申请编号
     */
    private String applyId;

    /**
     * 还款单ID
     */
    private String documentId;

    /**
     * 申请还款金额
     */
    private BigDecimal amount;

    /**
     * 申请还款时间
     */
    private Date repayTime;
}