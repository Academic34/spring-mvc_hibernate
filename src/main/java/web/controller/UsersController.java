package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return "users";
    }

//    @GetMapping("/{id}")
//    public String showUser(@RequestParam("id") int id, Model model) {
//        model.addAttribute("user", userService.show(id));
//        return "users/show";
//    }

//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user){
////        model.addAttribute("user", new User());
//        return "users/new";
//    }

//    @PostMapping()
//    String createNewUser(@RequestParam("name") String name,
//                         @RequestParam("lastName") String lastName,
//                         @RequestParam("yearOfBirth") int yearOfBirth,
//                         Model model) {
//
//        User user = new User(name, lastName, yearOfBirth);
//        userService.addUser(user);
//
//        model.addAttribute("user", user);
//
//        return "redirect:/users";
//    }

//    @PostMapping()
//    public String create(@ModelAttribute("user") User user) {
//        userService.addUser(user);
//        return "redirect:/users";
//    }

//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @RequestParam("id") int id) {
//        model.addAttribute("user", userService.show(id));
//        return "users/edit";
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
