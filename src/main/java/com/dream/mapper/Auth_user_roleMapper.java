package com.dream.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.dream.model.Auth_user_role;

@Repository
public interface Auth_user_roleMapper {
  Auth_user_role select(@Param(value="id") String id);
  
  ArrayList<Auth_user_role> select_class(Map<String, Object> auth_user_role);
  
  ArrayList<HashMap<String, Object>> select_map(Map<String, Object> auth_user_role);
  
  ArrayList<HashMap<String, Object>> select_custmap(Map<String, Object> auth_user_role);
  
  String select_count(Map<String, Object> auth_user_role);
  
  int insert(Auth_user_role auth_user_role);
  
  int insertBatch(ArrayList<Auth_user_role> auth_user_role);
  
  int update(Auth_user_role auth_user_role);
  
  int delete(@Param(value="id") String id);
  
  int delete_userid(@Param(value="user_id") String user_id);
}