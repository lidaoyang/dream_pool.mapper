package com.dream.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.dream.model.Auth_user;

@Repository
public interface Auth_userMapper {
  Auth_user select(@Param(value="id") String id);
  
  Auth_user select_uname(@Param(value="name") String name);
  
  ArrayList<Auth_user> select_class(Map<String, Object> auth_user);
  
  ArrayList<HashMap<String, Object>> select_map(Map<String, Object> auth_user);
  
  String select_count(Map<String, Object> auth_user);
  
  int insert(Auth_user auth_user);
  
  int insertBatch(ArrayList<Auth_user> auth_user);
  
  int update(Auth_user auth_user);
  
  int delete(@Param(value="id") String id);
}