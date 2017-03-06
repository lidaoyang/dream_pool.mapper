package com.dream.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.dream.model.Login_info;

@Repository
public interface Login_infoMapper {
  Login_info select(@Param(value="id") String id);
  
  ArrayList<Login_info> select_class(Map<String, Object> login_info);
  
  ArrayList<HashMap<String, Object>> select_map(Map<String, Object> login_info);
  
  String select_count(Map<String, Object> login_info);
  
  int insert(Login_info login_info);
  
  int insertBatch(ArrayList<Login_info> login_info);
  
  int update(Login_info login_info);
  
  int delete(@Param(value="id") String id);
}