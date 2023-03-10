package com.nowcoder.community.community.dao;

import com.nowcoder.community.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(@Param("id") int id,@Param("headerUrl") String headerUrl);

    int updatePassword(@Param("id") int id, @Param("password") String password);


}
