package com.bitacademy.car;

public class Brand
{
	private String code;
	private String name;

	public Brand()
	{
		super();
	}

	public Brand(String code, String name)
	{
		super();
		this.name = name;
		this.code = code;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}

	@Override
	public String toString()
	{
		return "Brand [name=" + name + ", code=" + code + "]";
	}

}
