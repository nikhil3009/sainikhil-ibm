package com.example.model;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ToDo
{	
	private String ID;
	private String name;
public ToDo(String name)
{
	this.ID=UUID.randomUUID().toString();
	this.name=name;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}