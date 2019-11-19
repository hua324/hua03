package com.zuikc.controller;

import com.zuikc.bean.Person;
import com.zuikc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
     * 测试Controller
     * @author zuikc
     */
    @Controller
    public class TestController {

        @RequestMapping(value = "/test")
        public ModelAndView test() {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("main");
            return mav;
        }

    @RequestMapping(value = "/test01",method = RequestMethod.GET)
    public ModelAndView test01() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping(value = "/test02",method = RequestMethod.GET)
    public ModelAndView test02(@RequestParam(required = false,defaultValue = "1") int a) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }

   /* @RequestMapping("/name")
    public ModelAndView name(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        mav.addObject("name","baobao");
        return  mav;
    }*/

   /* @RequestMapping("/name")
    public ModelAndView name(Model model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        model.addAttribute("name", "rongrong");
        return mav;
    }*/
  /* @RequestMapping("/name")
    public ModelAndView name(@ModelAttribute("name") String name){
       ModelAndView modelAndView=new ModelAndView();
       modelAndView.setViewName("main");
       return modelAndView;

   }
  @RequestMapping("/servlet")
   public void servlet(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
       String name=request.getParameter("name");
       session.setAttribute("name",name);
       request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request,response);
   }

*/
  /*@RequestMapping("/user")
  public ModelAndView rate(Person person){
    ModelAndView modelAndView=new ModelAndView();
    modelAndView.setViewName("main");
    modelAndView.addObject("person",person);
    return modelAndView;
   }
  @RequestMapping("/ids")
   public ModelAndView get(Integer[] ids){
      ModelAndView modelAndView=new ModelAndView();
      modelAndView.setViewName("ids");
      modelAndView.addObject("ids",ids);
      return modelAndView;
   }
   @RequestMapping("/list")
   public ModelAndView list() {
       ModelAndView modelAndView = new ModelAndView();
       List<User> list = new ArrayList<>();
       list.add(new User(1, "haha"));
       list.add(new User(2, "hehe"));
       modelAndView.addObject("list", list);
       return modelAndView;

   }
   @RequestMapping("string")
   public String returnString(){
      return "string";
   }*/

    @RequestMapping("/request")
    @ResponseBody
    public User jsonTest(@RequestBody User user) {
        return  user;
    }

  /*  @RequestMapping("/date")
    public void date(HttpServletResponse response, Date date) throws IOException {
        PrintWriter out = response.getWriter();
        out.write(date.toString());
    }*/

    }

