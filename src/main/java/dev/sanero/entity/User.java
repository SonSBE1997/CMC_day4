/**
 * Project name: News
 * Package name: dev.sanero.entity
 * File name: User.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 2:41:55 PM
 */

package dev.sanero.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 2:41:55 PM
 * Description: TODO - user entity.
 */
@Entity(name = "user")
@Table(name = "user")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private int id;

  @Column(name = "full_name", length = 50)
  private String name;

  @Column(name = "email", length = 50)
  private String email;

  @Column(name = "mobile", length = 11)
  private String mobile;

  @Column(name = "password", length = 20)
  private String password;

  @Column(name = "status", length = 50)
  private String status;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  private Set<UserRole> userRoles;

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @return the id
   */
  public int getId() {
    return id;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @return the name
   */
  public String getName() {
    return name;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @return the mobile
   */
  public String getMobile() {
    return mobile;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:45:50 PM
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 4:50:32 PM
   * @return the userRoles
   */
  public Set<UserRole> getUserRoles() {
    return userRoles;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 4:50:32 PM
   * @param userRoles the userRoles to set
   */
  public void setUserRoles(Set<UserRole> userRoles) {
    this.userRoles = userRoles;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:46:41 PM
   * Description: - .
   */
  public User() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:46:44 PM
   * Description: - .
   * @param id - user id.
   * @param name - user name.
   * @param email - user email.
   * @param mobile - user phone number.
   * @param password - user password.
   * @param status - user status.
   */
  public User(int id, String name, String email, String mobile, String password,
      String status) {
    super();
    this.id = id;
    this.name = name;
    this.email = email;
    this.mobile = mobile;
    this.password = password;
    this.status = status;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:46:46 PM
   */
  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", email=" + email
        + ", mobile=" + mobile + ", password=" + password + ", status=" + status
        + "]";
  }
}
