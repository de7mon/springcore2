package com.study.springcore2.homework1;

import java.util.Set;

public class Student {
 private Integer id;//學號
 private String name;//名子
 private Set<Clazz> clazzs;//所選的課程
 
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Clazz> getClazzs() {
	return clazzs;
}
public void setClazzs(Set<Clazz> clazzs) {
	this.clazzs = clazzs;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", clazzs=" + clazzs + "]";
} 
 
 
}