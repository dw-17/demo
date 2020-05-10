package com.example.jdk.mianshi;

import java.util.Objects;

class EqualsHashPerson {
    private String name;
    private int age;

    public EqualsHashPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EqualsHashPerson) {
            if (this.name.equals(((EqualsHashPerson) obj).name) && this.age == (((EqualsHashPerson) obj).age)) {
                return true;
            }
        }
        return false;
    }
}

public class EqualsHash {
    public static void main(String[] args) {
        EqualsHashPerson a = new EqualsHashPerson("Tom", 18);
        EqualsHashPerson b = new EqualsHashPerson("Tom", 18);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
