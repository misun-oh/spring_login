package com.omi.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omi.spring.dto.UserDto;

@Component
@Controller
public class LoginController {

	@Autowired
	UserDto userDto;
	
	
	@RequestMapping("/login")
	public String login(HttpServletRequest req, HttpServletResponse res, Model model) {
		// 로그인 되어 있는 상태라면 loginOk페이지로 이동
		HttpSession session = req.getSession();
		
		if((UserDto)session.getAttribute("user") != null) {
			model.addAttribute("user", (UserDto)session.getAttribute("user"));
			return "loginOk";
		}
		return "login";
	}
	
	@RequestMapping("/loginAction")
	public String loginAction(HttpServletRequest req, HttpServletResponse res, UserDto user, Model model) {
		HttpSession session = req.getSession();
		
		/**
		 * id/pw체크로직이 삽입 되어야 합니다.
		 */
		if("test".equals(user.getId())) {
			session.setAttribute("user", user);
			return "loginOk";			
		} else {
			model.addAttribute("errMsg", "로그인 실패-ID/PW를 확인해주세요.");
			return "login";
		}
	}
	
	@RequestMapping("/logoutAction")
	public String logoutAction(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		session.invalidate();
		
		return "login";
	}
}
