package com.acornsoft.cocktaildemo.demo.service;

import com.acornsoft.cocktaildemo.demo.dao.ICodeMapper;
import com.acornsoft.cocktaildemo.demo.vo.CodeVO;
import com.acornsoft.cocktaildemo.demo.vo.SubCodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService {

    @Autowired
    private ICodeMapper iCodeMapper;

    public List<CodeVO> getCodes(String groupId) {
        return iCodeMapper.getCodes(groupId);
    }

    public List<SubCodeVO> getSubCodes(String groupId, String subGroupId) {
        return iCodeMapper.getSubCodes(groupId, subGroupId);
    }

    public CodeVO getCode(String groupId, String code) {
        return iCodeMapper.getCode(groupId, code);
    }
}