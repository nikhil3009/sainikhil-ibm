package com.example.service;
import java.util.ArrayList;
import com.example.dao.DemoDaoImpl;
import com.example.model.Task;
public class DemoServiceImpl implements DemoService
{
	DemoDaoImpl objdao=new DemoDaoImpl();
	public void createToDoService(String name) 
	{
		objdao.createTask(name);
	}
	public ArrayList<Task> display() {
		// TODO Auto-generated method stub
		return objdao.display();
	}
	public void deleteService(String name) 
	{
		objdao.delete(name);
	}
	public void updateService(String oldname, String name) 
	{
		objdao.update(oldname, name);
	}
}
