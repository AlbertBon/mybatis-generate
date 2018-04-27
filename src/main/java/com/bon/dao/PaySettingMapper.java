package com.bon.dao;

import com.bon.model.PaySetting;

public interface PaySettingMapper {
    int deleteByPrimaryKey(Integer paySetId);

    int insert(PaySetting record);

    int insertSelective(PaySetting record);

    PaySetting selectByPrimaryKey(Integer paySetId);

    int updateByPrimaryKeySelective(PaySetting record);

    int updateByPrimaryKey(PaySetting record);
}