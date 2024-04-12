package com.ohgiraffers.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LectureController {

    @GetMapping("/lecture/expression")
    public ModelAndView expression(ModelAndView mv) {

        /* ModelAndView 이 친구는 Spring-Web-MVC 파트에서 깊게 다룰 예정이다.
        *  따라서 지금은 단순히 내가 보여줄 동적인 페이지와 정보들을 담을 클래스 라고
        *  생각을 해보자
        *  */

        mv.setViewName("/lecture/expression");

        return mv;
    }

}
