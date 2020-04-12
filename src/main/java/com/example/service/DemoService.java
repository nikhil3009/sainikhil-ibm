package com.example.service;
import java.util.ArrayList;
import com.example.model.Task;
public interface DemoService 
{
	public void createToDoService(String name);
	public ArrayList<Task> display();
	public void deleteService(String name);
	public void updateService(String oldname,String name);

}
