package com.dzr.common.mq.pojo.repayment;

public class RepaymentTopic {
    /** 还款申请消息 **/
    public static final String TAG_REPAYMENT_APPLICATION = "TAG_REPAYMENT_APPLICATION";
    /** 还款成功消息 **/
    public static final String TAG_REPAYMENT_SUCCESS = "TAG_REPAYMENT_SUCCESS";
    
    public static final String TAG_REPAYMENT_PART_SUCCESS = "TAG_REPAYMENT_PART_SUCCESS";
    /** 还款失败 消息 **/
    public static final String TAG_REPAYMENT_FAIL = "TAG_REPAYMENT_FAIL";

    public static final String TAG_REPAYMENT_OVERDUE = "TAG_REPAYMENT_OVERDUE";

    ////--------------------------------------------------------------------------------
    /** 还款提醒消息 **/
    public static final String TAG_REPAY_NOTIFY_NORMAL = "TAG_REPAY_NOTIFY_NORMAL";
    public static final String TAG_REPAY_NOTIFY_NORMAL_VOICE = "TAG_REPAY_NOTIFY_NORMAL_VOICE";
    /** 续借提醒消息 **/
    public static final String TAG_REPAY_NOTIFY_ROLLOVER = "TAG_REPAY_NOTIFY_ROLLOVER";


    ////--------------------------------------------------------------------------------
    public static final String TAG_REPAY_DEDUCT_NORMAL = "TAG_REPAY_DEDUCT_NORMAL";
    public static final String TAG_REPAY_DEDUCT_OVERDUE = "TAG_REPAY_DEDUCT_OVERDUE";
    
    ////--------------------------------------------------------------------------------
    /** 续借成功或失败消息  **/
    public static final String TAG_REPAY_ROLLOVER_NOTIFICATION = "TAG_REPAY_ROLLOVER_NOTIFICATION";
}


