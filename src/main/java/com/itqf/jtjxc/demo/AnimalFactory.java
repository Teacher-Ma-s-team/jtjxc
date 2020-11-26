package com.itqf.jtjxc.demo;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 9:58
 * description:
 */
public class AnimalFactory {

    public static Animal createAnimal(){

        return new Houzi();

    }
}
