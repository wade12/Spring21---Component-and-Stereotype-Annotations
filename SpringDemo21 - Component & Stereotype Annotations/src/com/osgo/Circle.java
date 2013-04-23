package com.osgo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
// @Service
// @Repository
// @Controller
public class Circle implements Shape
{
	private Point centre;
	
	public void draw()
	{
		System.out.println("Drawing Circle.");
		System.out.println("Circle with centre point at:" +"(" + centre.getX() + ", " + centre.getY() + ")" );
		
	} // end method draw

	public Point getCentre()
	{
		return centre;
	} // end method getCentre

	@Resource
	public void setCentre(Point centre)
	{
		this.centre = centre;
	} // end method setCentre

	@PostConstruct
	public void initialiseCircle()
	{
		System.out.println("Initialisation of Circle");
	} // end method initialiseCircle
	
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle");
	} // end method destroyCircle
	
} // end Class Circle
