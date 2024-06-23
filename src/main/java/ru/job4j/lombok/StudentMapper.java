package ru.job4j.lombok;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface  StudentMapper {
    @Mapping(target="className", source="classVal")
    StudentDto getModelFromEntity(StudentEntity student);


}