package com.example.dao;
import java.util.ArrayList;
import com.example.model.Task;
import com.example.model.ToDo;
public class DemoDaoImpl implements DemoDao
{
	int id=0;
	Task objtask;
	ToDo objtodo;
	public void createTask(String name)
	{
		objtask.addTodo(new ToDo(name));
		System.out.println("todo added");
	}
	public ArrayList<Task> display()
	{
		return objtask.display();
	}
	public void delete(String toDoName)
	{
		objtask.delete(toDoName);	
	}
	public void update(String oldName,String toDoName)
	{
		objtask.update(oldName, toDoName);
	}
}