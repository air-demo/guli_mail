package com.air.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.air.common.utils.PageUtils;
import com.air.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-09 20:01:54
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

