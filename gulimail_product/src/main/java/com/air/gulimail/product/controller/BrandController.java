package com.air.gulimail.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.air.common.utils.valid.AddGroup;
import com.air.common.utils.valid.UpdateGroup;
import com.air.common.utils.valid.UpdateStatusGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.air.gulimail.product.entity.BrandEntity;
import com.air.gulimail.product.service.BrandService;
import com.air.common.utils.PageUtils;
import com.air.common.utils.R;


/**
 * 品牌
 *
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-08 20:40:50
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand){
//        if(result.hasErrors()){
//            Map<String,String> map=new HashMap<>();
//
//            //1.获取校验的错误结果
//            result.getFieldErrors().forEach((item)-> {
//                //fieldError获取错误提示
//                String message=item.getDefaultMessage();
//
//                //获取错误的属性的名字
//                String field=item.getField();
//                map.put(field,message);
//            });
//
//
//            R.error(400,"提交的数据不合法").put("data",map);
//        }
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@Validated({UpdateGroup.class})@RequestBody BrandEntity brand){
		brandService.updateDetail(brand);

        return R.ok();
    }


    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    public R updateStatus(@Validated({UpdateStatusGroup.class})@RequestBody BrandEntity brand){
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
