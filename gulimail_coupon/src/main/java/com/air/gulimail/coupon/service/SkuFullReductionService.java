package com.air.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.air.common.utils.PageUtils;
import com.air.gulimail.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-09 10:37:49
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

