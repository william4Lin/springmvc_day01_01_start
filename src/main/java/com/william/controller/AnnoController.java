package com.william.controller;

import com.william.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})//把“msg=是一条存入信息”存入到session中
public class AnnoController {

    /**
     * RequestParam注解，把请求中指定名称的参数传递给控制器中的形参
     *
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "name") String uname) {
        System.out.println("testRequestParam()执行了");
        System.out.println(uname);
        return "success";
    }


    /**
     * RequestBody注解，用于获取请求体内容，直接使用得到是key=value&key=value....结构的数据，get请求不适用
     *
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("testRequestBody()执行了");
        try {
            requestBody = URLDecoder.decode(requestBody, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(requestBody);
        return "success";
    }


    /**
     * PathVarible注解，获取到绑定url中的占位符
     *
     * @return
     */
    @RequestMapping("/testPathVarible/{id}")
    public String testPathVarible(@PathVariable(name = "id") String sid) {
        System.out.println("testPathVarible()执行了");
        System.out.println(sid);
        return "success";
    }

    /**
     * RequestHeader注解，获取请求报文头
     *
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("testRequestHeader()执行了");
        System.out.println(header);
        return "success";
    }

    /**
     * CookieValue注解，获取cookie的值
     *
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("testCookieValue()执行了");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute注解，可以修饰方法和参数
     * 1.修饰方法时，表示当前方法先于控制器方法执行，修饰的方法可以有返回值也可以没有返回值
     * 2.修饰参数时，获取指定的数据给参数赋值
     *
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("newUser") User user) {
        System.out.println("testModelAttribute()执行了");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String uname, Map<String, User> map) {
        System.out.println("不带返回值的showUser()执行了");
        User user = new User();
        user.setBirthday(new Date());
        System.out.println(user);
        map.put("newUser", user);
    }

    @ModelAttribute
    public User showUser() {
        System.out.println("带返回值的showUser()执行了");
        User user = new User();
        user.setAge(111);
        user.setBirthday(new Date());
        System.out.println(user);
        return user;
    }

    /**
     * SessionAttributes注解，用于多次执行控制器方法间的参数共享
     * @param model
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes()执行了");
        //底层会将msg存储在request域对象中
        model.addAttribute("msg","这是一条存入信息");
        return "success";
    }

    /**
     * 从session中过去值
     * @param modelMap
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("getSessionAttributes()执行了");
        String msg = modelMap.get("msg").toString();
        System.out.println(msg);
        return "success";
    }

    /**
     * 把session中的值删除
     * @param sessionStatus
     * @return
     */
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus sessionStatus) {
        System.out.println("delSessionAttributes()执行了");
        sessionStatus.setComplete();
        return "success";
    }


}
