/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.crunchdroid.module.ejb.contat.manager.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Riad YOUSFI
 */
@Entity
@Table(name = "website")
public class Website extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "website_type_id")
    private WebsiteType websiteType;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "name")
    private String name;

    public Website() {
    }

    public Website(Contact contact, String name) {
        this.contact = contact;
        this.name = name;
    }

    public Website(WebsiteType websiteType, String name) {
        this.websiteType = websiteType;
        this.name = name;
    }

    public Website(Contact contact, WebsiteType websiteType, String name) {
        this.contact = contact;
        this.websiteType = websiteType;
        this.name = name;
    }

    public WebsiteType getWebsiteType() {
        return websiteType;
    }

    public void setWebsiteType(WebsiteType websiteType) {
        this.websiteType = websiteType;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Website ::: id -> %s, name -> %s, created -> %s, updated -> %s, websiteType -> %s",
                id, name, created, updated, websiteType);
    }

}