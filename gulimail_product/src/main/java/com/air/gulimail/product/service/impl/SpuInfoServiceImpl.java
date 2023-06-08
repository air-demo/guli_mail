package com.air.gulimail.product.service.impl;

import com.air.gulimail.product.vo.SpuSaveVo;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.air.common.utils.PageUtils;
import com.air.common.utils.Query;

import com.air.gulimail.product.dao.SpuInfoDao;
import com.air.gulimail.product.entity.SpuInfoEntity;
import com.air.gulimail.product.service.SpuInfoService;
import org.springframework.transaction.annotation.Transactional;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoEntity> page = this.page(
                new Query<SpuInfoEntity>().getPage(params),
                new QueryWrapper<SpuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Transactional
    @Override
    public void saveSpuInfo(SpuSaveVo vo) {
        //1.保存spu基本信息 pms_spu_info

        //2.保存spu的描述图片 pms_spu_info_desc

        //3.保存spu的图片集 pms_spu_images

        //4.保存spu的规格参数 pms_product_attr_value


        //5.保存当前spu对应的所有sku信息
        //5.1 sku的基本信息
    }

}