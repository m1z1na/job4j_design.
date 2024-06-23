package ru.job4j;

import org.mapstruct.factory.Mappers;
import ru.job4j.lombok.*;

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


        StudentSubjectMapper studentSubjectMapper = Mappers.getMapper(StudentSubjectMapper.class);
        StudentSubject sSubjectEntity = new StudentSubject(0,"тема", "ква"); 
        StudentSubjectDto fromSubjectEntity = studentSubjectMapper.getModelFromEntity(sSubjectEntity);
        System.out.println("fromSubjectDto = " + fromSubjectEntity);

    }
}
