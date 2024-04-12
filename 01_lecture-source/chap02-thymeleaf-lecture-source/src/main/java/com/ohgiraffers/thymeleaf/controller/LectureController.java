package com.ohgiraffers.thymeleaf.controller;

import com.ohgiraffers.thymeleaf.model.dto.MemberDTO;
import com.ohgiraffers.thymeleaf.model.dto.SelectCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lecture")
public class LectureController {

    @GetMapping("/expression")
    public ModelAndView expression(ModelAndView mv) {

        /* ModelAndView 이 친구는 Spring-Web-MVC 파트에서 깊게 다룰 예정이다.
        *  따라서 지금은 단순히 내가 보여줄 동적인 페이지와 정보들을 담을 클래스 라고
        *  생각을 해보자
        *  */
        mv.addObject("member", new MemberDTO("조평훈", 20, '남', "경기도 수원시"));

        mv.addObject("hello", "hello <h3>thymeleaf!!</h3>");

        mv.setViewName("/lecture/expression");

        return mv;
    }

    @GetMapping("/conditional")
    public ModelAndView conditional(ModelAndView mv) {

        mv.addObject("num", 1);
        mv.addObject("str", "바나나");

        List<MemberDTO> memberList = new ArrayList<>();
        memberList.add(new MemberDTO("홍길동", 20, '남', "서울시 노원구"));
        memberList.add(new MemberDTO("유관순", 16, '여', "서울시 도봉구"));
        memberList.add(new MemberDTO("장보고", 40, '남', "서울시 노진구"));
        memberList.add(new MemberDTO("신사임당", 30, '여', "서울시 영구"));

        mv.addObject("memberList", memberList);

        return mv;
    }

    @GetMapping("/etc")
    public ModelAndView etc(ModelAndView mv) {

        SelectCriteria selectCriteria = new SelectCriteria(1, 10, 3);
        mv.addObject(selectCriteria);

        return mv;
    }

}
