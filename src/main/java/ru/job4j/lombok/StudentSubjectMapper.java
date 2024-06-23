package ru.job4j.lombok;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper
public interface StudentSubjectMapper {
    @Mapping(target="className", source="classVal")
    StudentSubjectDto getModelFromEntity(StudentSubject studentSubject);
}