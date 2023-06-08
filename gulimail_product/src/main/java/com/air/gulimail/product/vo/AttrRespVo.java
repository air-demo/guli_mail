package com.air.gulimail.product.vo;

import lombok.Data;

/**
 * @author air
 * @create 2023-06-03-15:18
 */
@Data
public class AttrRespVo extends AttrVo{
    /**
     * "cateLogName":手机/数码/手机，//所属分类名字
     * "groupName":主题，//所属分组名字
     */
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
