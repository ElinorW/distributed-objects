//creates an interface to the database
package com.example.studentproject.repository;

        import com.example.studentproject.domain.Student;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
        List<Student>findByFirstNameContainingIgnoreCase(String searchTerm);
}