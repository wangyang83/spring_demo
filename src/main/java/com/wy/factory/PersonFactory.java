package com.wy.factory;

import com.wy.Person;

/**
 * @author: 王阳
 * Date:     2020/5/14 14:27
 * Description:
 */
public class PersonFactory {
    public static Person newInstant(){
        return new Person("汪洋",19);
    }
    public Person newInstanceBy(){
        return new Person("测试",1);
    }
}
