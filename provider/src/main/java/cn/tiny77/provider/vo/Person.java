package cn.tiny77.provider.vo;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@NotNull
	@Max(65)
	@Min(18)
	private Integer age;
	
	@NotNull
	@Pattern(regexp = "^张[\\u4E00-\\u9FFF]{0,3}$", message = "必须是姓张的")
	private String name;

	public Person(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	
}
