package com.example.qqfishing.mapper;

import com.example.qqfishing.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (account,passwd,ip,time) values (#{account},#{passwd},#{ip},#{time})")
    public void addUser(User user);
}
