package com.its.Member.controller;

import com.its.Member.DTO.MemberDTO;
import com.its.Member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/save-form")
    public String saveForm(){

        return "save";
    }

    @PostMapping("save1")
    public String saveActing(@ModelAttribute MemberDTO memberDTO){
        boolean saveResult =memberService.save1(memberDTO);
        if(saveResult =true){
            return "login";
        }else{
            return "index";
        }

    }
    @GetMapping("login-form")
    public String login(){
        return "login";
    }
    @PostMapping("login")
    public String  login1(@ModelAttribute MemberDTO memberDTO, Model model){
        MemberDTO loginMember = memberService.login(memberDTO);

        if(loginMember !=null){
            model.addAttribute("loginmember",loginMember);
            return "main";
        }else{
            return "login";
        }

    }
}
