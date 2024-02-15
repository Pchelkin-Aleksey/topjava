package ru.javawebinar.topjava.model;

import java.util.*;
import static ru.javawebinar.topjava.util.MealsUtil.DEFAULT_CALORIES_PER_DAY;

public class User extends AbstractNamedEntity {
    private String email;
    private String password;
    private boolean enabled;
    private Date registered = new Date();
    private Collection<Role> roles;
    private int caloriesPerDay;

    public User(Integer id, String name, String email, String password, Role... roles) { //Role role (это для сранения или что? )  Role... roles  - это перечесление?
        this(id, name, email, password, DEFAULT_CALORIES_PER_DAY, true, Arrays.asList(roles));
    }

    public User(Integer id, String name, String email, String password, int caloriesPerDay, boolean enabled, Collection<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.caloriesPerDay = caloriesPerDay;
        this.enabled = enabled;
        setRole(roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCaloriesPerDay() {
        return caloriesPerDay;
    }

    public void setCaloriesPerDay(int caloriesPerDay) {
        this.caloriesPerDay = caloriesPerDay;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public void setRole(Collection<Role> roles){
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email=" + email +
                ", name=" + name +
                ", enabled=" + enabled +
                ", roles=" + roles +
                ", caloriesPerDay=" + caloriesPerDay +
                '}';
    }
}