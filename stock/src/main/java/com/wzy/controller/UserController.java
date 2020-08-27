package com.wzy.controller;

import com.wzy.domain.User;
import com.wzy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/userAdd.do")
    public ModelAndView userAdd(User user){
        ModelAndView mv = new ModelAndView();
        int rs = userService.userAdd(user);
        String tips ="用户添加成功";
        if (rs == 1){
            mv.addObject(tips);
        }
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/userSelect.do")
    public ModelAndView userSelect(User user){
        ModelAndView mv = new ModelAndView();
        boolean rs = userService.userSelect(user);
        if(rs){
            mv.setViewName("goodsIndex");
            return mv;
        }
        String tips = "用户登录失败，请先注册";
        mv.addObject(tips);
        mv.setViewName("result");
        return mv;
    }
}
