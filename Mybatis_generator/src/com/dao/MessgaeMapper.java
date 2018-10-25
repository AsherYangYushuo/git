package com.dao;

import com.entity.Messgae;

public interface MessgaeMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Messgae record);

    int insertSelective(Messgae record);

    Messgae selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Messgae record);

    int updateByPrimaryKey(Messgae record);
}