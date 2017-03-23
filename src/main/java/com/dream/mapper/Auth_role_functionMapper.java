package com.dream.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.dream.model.Auth_role_function;

@Repository
public interface Auth_role_functionMapper {
  Auth_role_function select(@Param(value="id") String id);
  
  ArrayList<Auth_role_function> select_class(Map<String, Object> auth_role_function);
  
  ArrayList<HashMap<String, Object>> select_map(Map<String, Object> auth_role_function);
  
  String select_count(Map<String, Object> auth_role_function);
  
  int insert(Auth_role_function auth_role_function);
  
  int insertBatch(ArrayList<Auth_role_function> list);
  
  int insertBatchUpdate(ArrayList<Auth_role_function> list);
  
  int update(Auth_role_function auth_role_function);
  
  int delete(@Param(value="id") String id);
  
  int deleteRoleIdFunId(@Param(value="role_id") String role_id,@Param(value="functionIds") String functionIds);
  
  int delete_roleid(@Param(value="role_id") String role_id);
}