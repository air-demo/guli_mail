package com.air.gulimail.product.dao;

import com.air.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-08 20:40:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
