/**
 * Project name: News
 * Package name: dev.sanero.service
 * File name: UserRoleService.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 4:14:10 PM
 */

package dev.sanero.service;

import dev.sanero.entity.UserRole;
import dev.sanero.repository.UserRoleRepository;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 4:14:10 PM
 * Description: TODO - user role service.
 */
@Service
@Transactional
public class UserRoleService {
  @Autowired
  UserRoleRepository userRoleRepository;

  public void getAll() {
    List<UserRole> userRoles = userRoleRepository.findAll();
    System.out.println(userRoles.size());
  }
}
