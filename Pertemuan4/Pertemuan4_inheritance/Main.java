/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4_inheritance;

/**
 *
 * @author calvi
 */
public class Main {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        Zombie zumbi = new Zombie();
        Pocong hantuPocong = new Pocong();
        Burung garuda = new Burung();

        monster.attack();
        zumbi.walk();
        hantuPocong.jump();
        garuda.walk();
        garuda.jump();
        garuda.fly();
    }
}
