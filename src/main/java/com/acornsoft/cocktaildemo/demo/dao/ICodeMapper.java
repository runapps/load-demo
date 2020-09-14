package com.acornsoft.cocktaildemo.demo.dao;

import com.acornsoft.cocktaildemo.demo.vo.CodeVO;
import com.acornsoft.cocktaildemo.demo.vo.SubCodeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ICodeMapper {
    List<CodeVO> getCodes(String groupId);

    List<SubCodeVO> getSubCodes(@Param("groupId") String groupId, @Param("subGroupId") String subGroupId);

    CodeVO getCode(@Param("groupId") String groupId, @Param("code") String code);
}
