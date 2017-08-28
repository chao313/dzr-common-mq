package com.dzr.common.mq.pojo.repayment;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RepaymentRolloverNotification {

	private String rolloverId;
	private boolean rolloverResult;
}
