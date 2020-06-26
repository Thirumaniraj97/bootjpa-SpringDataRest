package com.example.bootjpaSpringDataRest;

import com.example.bootjpaSpringDataRest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "students", path="students")
public interface StudentRepo extends JpaRepository<Student,Integer>
{

}
