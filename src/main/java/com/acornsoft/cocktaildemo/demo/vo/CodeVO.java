package com.acornsoft.cocktaildemo.demo.vo;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Code")
public class CodeVO extends BaseVO {
	String groupId;
	
	String code;
	
	String value;
	
	String description;
}