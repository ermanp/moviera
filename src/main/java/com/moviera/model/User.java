package com.moviera.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * User: EXT02D8158
 * Date: 19.01.2019
 * Time: 17:36
 */
@Entity
@Table(name = "T_USER")
public class User
{
/*    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "ID")*/
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_NAME", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private Profile profile;

    public User() {}

    public User(String name)
    {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Profile getProfile()
    {
        return profile;
    }

    public void setProfile(Profile profile)
    {
        this.profile = profile;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
