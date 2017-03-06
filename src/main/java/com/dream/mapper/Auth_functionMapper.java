package com.dream.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.dream.model.Auth_function;

@Repository
public interface Auth_functionMapper {
  Auth_function select(@Param(value="id") String id);
  
  ArrayList<Auth_function> select_class(Map<String, Object> auth_function);
  
  ArrayList<Auth_function> select_custclass(Map<String, Object> auth_function);
  
  ArrayList<Auth_function> select_custclass2(Map<String, Object> auth_function);
  
  ArrayList<HashMap<String, Object>> select_map(Map<String, Object> auth_function);
  
  String select_count(Map<String, Object> auth_function);
  
  String select_count2(Map<String, Object> auth_function);
  
  int insert(Auth_function auth_function);
  
  int insertBatch(ArrayList<Auth_function> auth_function);
  
  int update(Auth_function auth_function);
  
  int delete(@Param(value="id") String id);
}