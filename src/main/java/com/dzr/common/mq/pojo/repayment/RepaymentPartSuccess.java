package com.dzr.common.mq.pojo.repayment;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RepaymentPartSuccess {

	 /*还款计划ID*/
    private String planId;
    /*还款单ID*/
    private String documentId;
    /*1:结清核销，0：部分核销*/
    private Integer type;
    
}