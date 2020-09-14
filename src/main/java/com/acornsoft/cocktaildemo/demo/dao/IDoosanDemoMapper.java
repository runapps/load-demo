package com.acornsoft.cocktaildemo.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface IDoosanDemoMapper {

    List<Map<String, Object>> getDevices();

    List<Map<String, Object>> getCodes();

    List<Map<String, Object>> getCodes2();

    List<Map<String, Object>> getCodeParam(String param);

}
