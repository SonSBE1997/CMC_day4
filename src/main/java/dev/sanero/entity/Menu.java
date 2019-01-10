/**
 * Project name: News
 * Package name: dev.sanero.entity
 * File name: Menu.java
 * Author: Sanero.
 * Created date: Jan 10, 2019
 * Created time: 3:21:40 PM
 */

package dev.sanero.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author Sanero.
 * Created date: Jan 10, 2019
 * Created time: 3:21:40 PM
 * Description: TODO - Menu entity.
 */
@Entity(name = "menu")
@Table(name = "menu")
public class Menu implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "menu_id")
  private int menuId;

  @Column(name = "name", length = 50)
  private String name;

  @Column(name = "desc", length = 50)
  private String desc;

  @Column(name = "controller", length = 50)
  private String controller;

  @Column(name = "function", length = 50)
  private String function;

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @return the menuId
   */
  public int getMenuId() {
    return menuId;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @param menuId the menuId to set
   */
  public void setMenuId(int menuId) {
    this.menuId = menuId;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @return the name
   */
  public String getName() {
    return name;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @return the desc
   */
  public String getDesc() {
    return desc;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @param desc the desc to set
   */
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @return the controller
   */
  public String getController() {
    return controller;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @param controller the controller to set
   */
  public void setController(String controller) {
    this.controller = controller;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @return the function
   */
  public String getFunction() {
    return function;
  }

  /*
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:29 PM
   * @param function the function to set
   */
  public void setFunction(String function) {
    this.function = function;
  }

  /**
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 3:43:36 PM
   * Description: - .
   */
  public Menu() {
    super();
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   * Author: Sanero.
   * Created date: Jan 10, 2019
   * Created time: 4:57:59 PM
   */
  @Override
  public String toString() {
    return "Menu [menuId=" + menuId + ", name=" + name + ", desc=" + desc
        + ", controller=" + controller + ", function=" + function + "]";
  }
}
