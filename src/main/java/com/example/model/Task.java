package com.example.model;

import java.util.ArrayList;
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
public class Task 
{
	public ArrayList<Task> getObjarray() {
		return objarray;
	}
	public void setObjarray(ArrayList<Task> objarray) {
		this.objarray = objarray;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public ToDo getObjtodo() {
		return objtodo;
	}
	public void setObjtodo(ToDo objtodo) {
		this.objtodo = objtodo;
	}
	public Task getObjtask() {
		return objtask;
	}
	public void setObjtask(Task objtask) {
		this.objtask = objtask;
	}
	ArrayList<Task> objarray;
	private String taskId;
	private ToDo objtodo;
	Task objtask;
	{
		objarray=new ArrayList<Task>();
		taskId=UUID.randomUUID().toString();
	}
	public void addTodo(ToDo objtodo)
	{
		objtask=new Task();
		objtask.setTaskId(taskId);
		objtask.setObjtodo(objtodo);
		objarray.add(objtask);
		
	}
	public ArrayList<Task> display()
	{
		return objarray;
	}
	public void delete(String name)
	{
		int i=0;
		for(Task task:objarray)
		{
			if(task.getObjtodo().getName().equals(name))
			{
				objarray.remove(i);
				System.out.println("object deleted");
				break;
			}
			i++;
		}
	}
	public void update(String oldname,String name)
	{
		int i=0;
		for(Task task:objarray)
		{
			if(task.getObjtodo().getName().equals(oldname))
			{
				objtask=new Task();
				objtodo=task.getObjtodo();
				objtodo.setName(name);
				objtask.setObjtodo(objtodo);
				objarray.set(i, objtask);
				System.out.println("object updated");
				break;
				
				
			}
			i++;
		}
		
	}

}
