/**
 * Project name: News
 * Package name: dev.sanero.entity
 * File name: Role.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 2:49:27 PM
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
 * Created time: 2:49:27 PM
 * Description: TODO - role entity.
 */
@Entity(name = "role")
@Table(name = "role")
public class Role implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "role_id")
  private int id;

  @Column(name = "name", length = 50)
  private String name;

  @Column(name = "desc", length = 50)
  private String desc;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "role_id")
  private Set<UserRole> userRoles;

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:30 PM
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:30 PM
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:30 PM
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:30 PM
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:30 PM
   * @return the desc
   */
  public String getDesc() {
    return desc;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:30 PM
   * @param desc the desc to set
   */
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 4:50:09 PM
   * @return the userRoles
   */
  public Set<UserRole> getUserRoles() {
    return userRoles;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 4:50:09 PM
   * @param userRoles the userRoles to set
   */
  public void setUserRoles(Set<UserRole> userRoles) {
    this.userRoles = userRoles;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:35 PM
   * Description: - .
   */
  public Role() {
    super();
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 2:54:38 PM
   */
  @Override
  public String toString() {
    return "Role [id=" + id + ", name=" + name + ", desc=" + desc + "]";
  }
}
