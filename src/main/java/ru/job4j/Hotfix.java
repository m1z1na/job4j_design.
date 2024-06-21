package ru.job4j;

import ru.job4j.lombok.Category;
import ru.job4j.lombok.Permission;

public class Hotfix {
    public static void main(String[] args) {
        Category category = new Category(1);
        category.setName("test");
        System.out.println(category.getId());
        System.out.println(category.getName());
        System.out.println(category);


        var permission = Permission.of()
                .id(1)
                .name("Lena")
                .accessBy("play")
                .accessBy("eat")
                .accessBy("run")
                .build();
        System.out.println(permission);

    }
}
