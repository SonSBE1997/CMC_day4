/**
 * Project name: Day4
 * Package name: com.team1.controller
 * File name: LoginController.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 8:56:58 AM
 */

package dev.sanero.controller;

import dev.sanero.entity.User;
import dev.sanero.service.UserService;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 8:56:58 AM
 * Description: TODO - 
 */
@Controller
@RequestMapping("/admin/login")
@SessionAttributes("userLogin")
public class LoginController {
  @Autowired
  UserService userService;

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 5:59:02 PM
   * Description: TODO - .
   * @param session - session.
   * @return
   */
  @GetMapping
  public String login(HttpSession session) {
    if (session.getAttribute("userLogin") != null) {
      return "redirect:/admin";
    }
    return "login";
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 5:07:51 PM
   * Description: TODO - .
   * @param user - user Login.
   * @param model - Model map.
   * @param attributes - redirect attribute.
   * @return
   */
  @PostMapping
  public RedirectView handleLogin(@ModelAttribute User user, ModelMap model,
      RedirectAttributes attributes) {
    User userLogin = userService.findUserByEmailAndPassword(user.getEmail(),
        user.getPassword());

    if (userLogin == null) {
      attributes.addFlashAttribute("mess", "username or password incorrect");
      return new RedirectView("/admin/login");
    }

    model.addAttribute("userLogin", userLogin);
    return new RedirectView("/admin");
  }
}
