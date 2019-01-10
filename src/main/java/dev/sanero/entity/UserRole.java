/**
 * Project name: News
 * Package name: dev.sanero.entity
 * File name: UserRole.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 3:05:07 PM
 */

package dev.sanero.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 3:05:07 PM
 * Description: TODO - User Role table.
 */
@Entity(name = "user_role")
@Table(name = "user_role")
public class UserRole implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private UserRolePrimaryKey primaryKey;

  @Column(name = "status", length = 50)
  private String status;

  @Column(name = "created_at")
  private Date createdAt;

  @Column(name = "updated_at")
  private Date updateAt;

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @return the primaryKey
   */
  public UserRolePrimaryKey getPrimaryKey() {
    return primaryKey;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @param primaryKey the primaryKey to set
   */
  public void setPrimaryKey(UserRolePrimaryKey primaryKey) {
    this.primaryKey = primaryKey;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @param createdAt the createdAt to set
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @return the updateAt
   */
  public Date getUpdateAt() {
    return updateAt;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:06 PM
   * @param updateAt the updateAt to set
   */
  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:10:10 PM
   * Description: - .
   */
  public UserRole() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:11:37 PM
   * Description: - Constructor.
   * @param roleId - role id.
   * @param userId - user id.
   */
  public UserRole(int roleId, int userId) {
    this.primaryKey = new UserRolePrimaryKey(userId, roleId);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:12:16 PM
   */
  @Override
  public String toString() {
    return "UserRole [userId=" + primaryKey.getUserId() + ", roleId="
        + primaryKey.getRoleId() + ", status=" + status + ", createdAt="
        + createdAt + ", updateAt=" + updateAt + "]";
  }
}
