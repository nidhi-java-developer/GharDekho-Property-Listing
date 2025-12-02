package com.univ.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.univ.model.Customer;
import com.univ.services.CustomerServices;

@Controller
public class IndexController {
	@Autowired
	CustomerServices custSer;
	@Autowired
	HttpServletRequest req;
	
@RequestMapping("/")
public String index()
{
   return "index";	
}

@RequestMapping("/index")
public String index1()
{
   return "index";	
}

@RequestMapping("/about")
public String about()
{
   return "about";	
}

@RequestMapping("/contact")
public String contact()
{
   return "contact";	
}

@RequestMapping("/property-agent")
public String propertyagent()
{
   return "property-agent";	
}

@RequestMapping("/property-list")
public String propertylist()
{
   return "property-list";	
}

@RequestMapping("/property-type")
public String propertytype()
{
   return "property-type";	
}

@RequestMapping("/testimonial")
public String testimonial()
{
   return "testimonial";	
}

@RequestMapping("/404")
public String Er404()
{
   return "404";	
}
@RequestMapping("/registration")
public String registration()
{
  return "registration"	;
}

@RequestMapping("/reg")
public String custReg(@ModelAttribute("cust")Customer cust)
{
 	int x=custSer.createUser(cust);
 	if(x!=0)
 	{
 		return "login";
 	}else {
 		return "registration";
 	}
 	
}
@RequestMapping("/login")
public String login()
{
 HttpSession hs1=req.getSession(false);
 if(hs1!=null)
 {
  hs1.invalidate();	 
 }
  return "login";	
}
@RequestMapping("/login1")
public String login1(@ModelAttribute("cust") Customer cust )
{
  
 List<Customer> ct= custSer.loginCheck(cust);
  if(ct==null || ct.isEmpty())
  {
	return "login";  
  }else {
	HttpSession hs=  req.getSession(true);	
	hs.setAttribute("user", ct);
	return "index";	  
  }
}
}
