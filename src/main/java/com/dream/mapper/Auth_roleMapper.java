package com.dream.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.dream.model.Auth_role;

@Repository
public interface Auth_roleMapper {
  Auth_role select(@Param(value="id") String id);
  
  ArrayList<Auth_role> select_class(Map<String, Object> auth_role);
  
  ArrayList<HashMap<String, Object>> select_map(Map<String, Object> auth_role);
  
  String select_count(Map<String, Object> auth_role);
  
  int insert(Auth_role auth_role);
  
  int insertBatch(ArrayList<Auth_role> auth_role);
  
  int update(Auth_role auth_role);
  
  int delete(@Param(value="id") String id);
}