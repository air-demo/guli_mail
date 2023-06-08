package com.air.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.air.common.utils.PageUtils;
import com.air.gulimail.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-09 13:19:43
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

