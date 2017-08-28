package com.dzr.common.mq.pojo.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 资料填写完成
 *
 * @author tanxiongying
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class PhoneDone {

    private Long userId;
    private String phone;
    private String name;
}
