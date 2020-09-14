package com.acornsoft.cocktaildemo.demo.vo;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("SubCode")
public class SubCodeVO extends BaseVO {
	String groupId;
	
	String subGroupId;
	
	String subCodeGroupId;
	
	String code;
	
	String value;
	
	String description;
}