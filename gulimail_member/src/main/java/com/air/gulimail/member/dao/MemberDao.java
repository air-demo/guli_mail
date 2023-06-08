package com.air.gulimail.member.dao;

import com.air.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author air
 * @email 1173905738@qq.com
 * @date 2023-03-09 13:19:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
