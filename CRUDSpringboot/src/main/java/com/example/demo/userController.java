package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class userController {
	
	@Autowired
	userService us;
	
	@RequestMapping("/")
	private String reg()
	{
		return "reg";
	}
	
	@RequestMapping("/saveInfo")
	private String saveInfo(@ModelAttribute("u1") user u1,@RequestParam("file") MultipartFile filename,@RequestParam("skill[]") String[] skillarray) throws Exception
	{
		File f1=new File("C:\\Users\\sai\\java basic\\CRUDSpringboot\\src\\main\\resources\\static\\images\\");
		
		String fname=filename.getOriginalFilename();
		filename.transferTo(new File(f1,fname));
		u1.setFilename(fname);
		
		String sk=String.join(",", skillarray);
		u1.setSkill(sk);
		
       us.regiter(u1);

		return "redirect:/display";
	}
	
	@RequestMapping("/display")
	private String display(Model m)
	{
		List<user> l1=us.getAllInfo();
		m.addAttribute("temp",l1);
		return "display";
	}
	
	@RequestMapping("/login")
	private String login()
	{
		return "login";
	}
	
	@RequestMapping("check")
	private String check(@RequestParam("name") String name,@RequestParam("pass") String pass)
	{
		user u=us.check(name, pass);
		if(u!=null)
		{
			return "redirect:/dash";
		}
		return "redirect:/login";
	}
	
	@RequestMapping("/deldata/{id}")
	private String delete(@PathVariable int id)
	{
		us.deldata(id);
		return "redirect:/display";
		
	}
	
	
	@RequestMapping("/editdata/{id}")
	private String edit(@PathVariable int id,Model m)
	{
		user u=us.editdata(id);
		m.addAttribute("kk",u);
		return "editdata";
		
		
	}
	
	@RequestMapping("/updatedata")
	private String update(@ModelAttribute("u1") user u1,@RequestParam("file") MultipartFile filename,@RequestParam("skill[]") String[] skillarray) throws Exception
	{
         File f1=new File("C:\\Users\\sai\\java basic\\CRUDSpringboot\\src\\main\\resources\\static\\images\\");
		
		String fname=filename.getOriginalFilename();
		filename.transferTo(new File(f1,fname));
		u1.setFilename(fname);
		
		String sk=String.join(",", skillarray);
		u1.setSkill(sk);
		
		us.regiter(u1);
		return "redirect:/display";
	}
	

	

}
