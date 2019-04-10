package com.moviera.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * User: EXT02D8158
 * Date: 19.01.2019
 * Time: 17:36
 */
@Entity
@Table(name = "T_PROFILE")
public class Profile
{
/*    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "ID")*/
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NUMBER", nullable = false)
    private String number;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "profile")
    private User user;


    public Profile() {}

    public Profile(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
