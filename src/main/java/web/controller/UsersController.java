package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String ShowAllUsers(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());
        return "usersAll";
    }

//    @GetMapping("/{id}")
//    public String showUser(@RequestParam("id") int id, Model model) {
//        model.addAttribute("user", userService.show(id));
//        return "users/show";
//    }

    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping("/saveUser")
    public String create(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

//    @GetMapping("/edit")
//    public String edit(Model model, @RequestParam("id") int id) {
//        model.addAttribute("user", userService.show(id));
//        return "edit";
//    }
//
//    @GetMapping("/{id}/update")
//    public String update(@ModelAttribute("user") User user, @RequestParam("id") int id) {
//        userService.changeUser(id, user);
//        return "redirect:/users";
//    }
//
//    @GetMapping("/{id}/delete")
//    public String delete(@RequestParam("id") int id) {
//        userService.removeUser(id);
//        return "redirect:/users";
//    }

}
