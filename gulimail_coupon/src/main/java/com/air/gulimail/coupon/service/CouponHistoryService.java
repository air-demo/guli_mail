package com.air.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.air.common.utils.PageUtils;
import com.air.gulimail.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-09 10:37:49
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

