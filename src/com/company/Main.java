package com.company;

import com.company.Human.Human;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Hlib", "Astashev", "Nab. Peremohy", 19);
        Human human1 = new Human("Hlib", "Astashev", "Nab. Peremohy", 19);
        System.out.println(human.toString());
        if (human.equals(human1)) System.out.println("Oh, it's the same person!");
    }
}
