/**
 * Project name: News
 * Package name: dev.sanero.entity
 * File name: UserRolePrimaryKey.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 3:00:55 PM
 */

package dev.sanero.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 3:00:55 PM
 * Description: TODO - primary key of User Role table
 */
@Embeddable
public class UserRolePrimaryKey implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "user_id", nullable = false)
  private int userId;

  @Column(name = "role_id", nullable = false)
  private int roleId;

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:03:55 PM
   * @return the userId
   */
  public int getUserId() {
    return userId;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:03:55 PM
   * @param userId the userId to set
   */
  public void setUserId(int userId) {
    this.userId = userId;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:03:55 PM
   * @return the roleId
   */
  public int getRoleId() {
    return roleId;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:03:55 PM
   * @param roleId the roleId to set
   */
  public void setRoleId(int roleId) {
    this.roleId = roleId;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:04:00 PM
   * Description: - initalization user role primary key.
   * @param userId - user id.
   * @param roleId - role id.
   */
  public UserRolePrimaryKey(int userId, int roleId) {
    super();
    this.userId = userId;
    this.roleId = roleId;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:04:03 PM
   * Description: - .
   */
  public UserRolePrimaryKey() {
    super();
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:04:06 PM
   */
  @Override
  public String toString() {
    return "UserRolePrimaryKey [userId=" + userId + ", roleId=" + roleId + "]";
  }
}
