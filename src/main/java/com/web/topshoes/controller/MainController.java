package com.web.topshoes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.topshoes.entity.LoginEntity;
import com.web.topshoes.repository.LoginJobSeekerRepository;

@Controller
public class MainController {
@Autowired
private LoginJobSeekerRepository loginJobSeekerRepository;
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/loginJobSeeker")
	public String loginJobSeeker() {
		return "loginJobSeeker";
	}
	@RequestMapping("/registerJobSeeker")
	public String registerJobSeeker() {
		
		return "registerJobSeeker";
	}
	@RequestMapping("/forgotpassword")
	public String forgetpassword() {
		
		return "forgotpassword";
	}
	@RequestMapping("/preRegisterJobSeeker-save")
	public String preRegisterJobSeeker(HttpServletRequest request,HttpSession session,Model model) {
		LoginEntity loginEntity =new LoginEntity();;
		String f_name=request.getParameter("inputFirstName");
		String l_name=request.getParameter("inputLastName");
		String email=request.getParameter("inputEmailAddress");
		String password=request.getParameter("inputPassword");
		loginEntity.setEmail(email);
		loginEntity.setF_name(f_name);
		loginEntity.setL_name(l_name);
		loginEntity.setPassword(password);
		loginJobSeekerRepository.save(loginEntity);
		 model.addAttribute("succMsg", "You have Registered Successfully");
		return "registerJobSeeker";
	}
	
	@RequestMapping("/jobSeekerValidation" )
	public String jobSeekerValidation(HttpServletRequest request,Model model) {
		String email=request.getParameter("inputEmailAddress");
		String pass=request.getParameter("inputPassword");
		HttpSession session=request.getSession();
		  LoginEntity loginEntity=new LoginEntity();
		  loginEntity=loginJobSeekerRepository.findByEmailAndPassword(email,pass);
		   if(loginEntity!=null) {
			   session.setAttribute("email", email);
			   session.setAttribute("firstName",loginEntity.getF_name());
			   return "HomePageJobSeekers";
			 
		   }
		   else {
			    model.addAttribute("invalidPass", "Wrong Credential");
			   return "loginJobSeeker";
		   }
		
		
	}
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.invalidate();
		return "loginJobSeeker";
		
	}
	@RequestMapping("employerLogin")
	public String employerLogin(HttpServletRequest request) {
		
		return "loginEmployer";
		
	}
}
