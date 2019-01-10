/**
 * Project name: News
 * Package name: dev.sanero.repository
 * File name: RoleMenuRepository.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 4:08:38 PM
 */

package dev.sanero.repository;

import dev.sanero.entity.UserRole;
import dev.sanero.entity.UserRolePrimaryKey;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 4:08:38 PM
 * Description: TODO - Role Menu Repository
 */
public interface UserRoleRepository
    extends JpaRepository<UserRole, UserRolePrimaryKey> {

}
