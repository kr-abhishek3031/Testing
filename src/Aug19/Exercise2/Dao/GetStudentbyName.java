package Aug19.Exercise2.Dao;

import Aug19.Exercise2.Entity.Student;

import java.util.Optional;

public interface GetStudentbyName {
    Optional<Student> getStudentByName(String name);
}
