package com.example.dao;
import java.util.ArrayList;
import com.example.model.Task;
public interface DemoDao
{
	public void createTask(String name);
	public ArrayList<Task> display();
	public void delete(String name);
	public void update(String oldname,String newname);

}
