package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.dao.UsersDao;
import spring.dao.UsersDaoImpl;
import spring.model.User;
import spring.service.UsersService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Damian Stępniak on 10.03.2017.
 */

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private UsersDao usersDao;

    @RequestMapping("/")
    public
    String index(ModelMap modelMap){
        modelMap.addAttribute("users", usersDao.getAll());
      return "index";
    }





}
