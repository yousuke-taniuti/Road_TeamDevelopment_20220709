package com.employeesignup.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class employeeSignupForm  {
	@Size(max=8, message = "IDは８桁以内で入力してください")	
	@NotEmpty(message = "IDを入力してください")
	private String user_id;
		
	@NotEmpty(message = "名前を入力してください")
	private String name;
	
	@NotEmpty(message = "カタカナで入力してください")
	private String name_kana;
		
	@NotEmpty(message = "passwordを入力してください")
	private String password;
		
	@NotEmpty(message = "メールアドレスを入力してください")
	private String upn;
		
	@NotNull(message = "生年月日を入力してください")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private  Date birthday;
		
	@NotNull(message = "性別を選択してください")
	private Integer gender;
	
	@NotNull(message = "出身都道府県を選択してください")
	private Integer prefecture_code;
		
	@NotNull(message = "部署を選択してください")
	private Integer department_code;
	    
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private  Date entry_date;
	    
	private String prefecture_name;

	private String department_name;

	@NotEmpty(message = "役職を選択してください")
	private String role_code;
	
	private String role_name;
}
