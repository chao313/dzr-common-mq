package com.dzr.common.mq.pojo.repayment;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * 还款失败消息
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RepaymentFail {
    /**
     * 申请编号
     */
    private String applyId;

    /**
     * 还款单ID
     */
    private String documentId;

    /**
     * 失败时间
     */
    private Date failTime;

    /**
     * 失败原因
     */
    private String cause;

}