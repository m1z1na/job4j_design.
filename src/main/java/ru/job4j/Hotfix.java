package ru.job4j;

import ru.job4j.lombok.Category;

public class Hotfix {
    public static void main(String[] args) {
        Category category = new Category(1);
        category.setName("test");
        System.out.println(category.getId());
        System.out.println(category.getName());
        System.out.println(category);
    }
}
