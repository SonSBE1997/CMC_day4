/**
 * Project name: News
 * Package name: dev.sanero.service
 * File name: UserService.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 5:28:07 PM
 */

package dev.sanero.service;

import dev.sanero.entity.User;
import dev.sanero.repository.UserRepository;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 5:28:07 PM
 * Description: TODO - 
 */
@Service
@Transactional
public class UserService {
  @Autowired
  UserRepository userRepository;

  public User findUserByEmailAndPassword(String email, String password) {
    return userRepository.findUserByEmailAndPassword(email, password);
  }
}
