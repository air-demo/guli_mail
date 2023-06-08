package com.air.gulimail.order.dao;

import com.air.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-09 20:01:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
