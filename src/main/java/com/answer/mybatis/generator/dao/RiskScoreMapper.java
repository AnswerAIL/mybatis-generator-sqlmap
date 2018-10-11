package com.answer.mybatis.generator.dao;

import com.answer.mybatis.generator.entity.RiskScore;

public interface RiskScoreMapper {
    int insert(RiskScore record);

    int insertSelective(RiskScore record);
}