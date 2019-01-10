/**
 * Project name: News
 * Package name: dev.sanero.controller
 * File name: Controller.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 4:45:48 PM
 */

package dev.sanero.controller;

import dev.sanero.service.UserRoleService;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 4:45:48 PM
 * Description: TODO - Home Controller
 */
@Controller
@RequestMapping("/admin")
public class HomeController {
  @Autowired
  UserRoleService userRoleService;

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 5:42:00 PM
   * Description: TODO - .
   * @return
   */
  @GetMapping()
  public String index() {
    userRoleService.getAll();
    return "index";
  }

  @GetMapping("/logout")
  public String handleLogout(HttpSession session) {
    session.removeAttribute("userLogin");
    return "redirect:/admin";
  }
}
