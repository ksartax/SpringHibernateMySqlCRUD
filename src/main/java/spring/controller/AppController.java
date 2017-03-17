package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import spring.model.User;
import spring.model.User_login;
import spring.service.UsersLoginService;
import spring.service.UsersService;

/**
 * Created by Damian Stępniak on 10.03.2017.
 */

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersLoginService usersLoginDao;

    @RequestMapping("/")
    public
    String index(ModelMap modelMap){
     modelMap.addAttribute("users", usersService.getAll());
      return "index";
    }

    @RequestMapping(value = "/update-{id}", method = RequestMethod.GET )
    public
    String update(@PathVariable int id, ModelMap modelMap){
        modelMap.addAttribute("user", usersService.get(id));
        System.out.print(usersService.get(id).toString());
        return "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute User user){
        usersService.update(user);
        return "redirect:update-"+user.getId_user();
    }

    @RequestMapping(value = "/create")
    public String create(@ModelAttribute("user")User user, @ModelAttribute("user_login")User_login user_login){
        if(user.getFirstName() != null){
                user_login.setUser(user);
                usersLoginDao.save(user_login);
            return "redirect:/";
        }else{
            return "add";
        }
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable int id){
        usersService.delete(id);
        return "redirect:/";
    }


}
