package com.air.gulimail.product.service;

import com.air.gulimail.product.vo.AttrGroupWithAttrsVo;
import com.air.gulimail.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.air.common.utils.PageUtils;
import com.air.gulimail.product.entity.AttrGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-08 23:02:36
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);
}

