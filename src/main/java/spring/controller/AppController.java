package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import spring.dao.UsersDao;
import spring.dao.UsersDaoImpl;
import spring.model.User;
import spring.service.UsersService;
import sun.misc.Request;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Damian Stępniak on 10.03.2017.
 */

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private UsersService usersDao;

    @RequestMapping("/")
    public
    String index(ModelMap modelMap){
        modelMap.addAttribute("users", usersDao.getAll());
      return "index";
    }

    @RequestMapping(value = "/update-{id}")
    public
    String update(@PathVariable int id, ModelMap modelMap){
        modelMap.addAttribute("user", usersDao.get(id));
        return "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute User user){
        usersDao.update(user);
        return "redirect:update-"+user.getId_user();
    }








}
