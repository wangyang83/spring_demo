package com.wy;

import java.util.Map;
import java.util.Set;

/**
 * @author: 王阳
 * Date:     2020/5/14 10:23
 * Description:
 */
public class Person {
    private String name;
    private Integer age;

    private Set<String> names;

    private Map<String,String> maps;
    private User user;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", names=" + names +
                ", maps=" + maps +
                ", user=" + user +
                '}';
    }
}
