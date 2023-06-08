package com.air.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.air.common.utils.PageUtils;
import com.air.gulimail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-08 23:02:36
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

