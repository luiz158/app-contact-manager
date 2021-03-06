/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.crunchdroid.module.ejb.contat.manager.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Riad YOUSFI
 */
@Entity
@Table(name = "role")
public class Role extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> user = new ArrayList<>();

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format("\nRole ::: [ id = %s, name = %s, created = %s, updated = %s ]",
                id, name, created, updated);
    }

}
