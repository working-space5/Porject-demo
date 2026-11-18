package school.School;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
public class StudentOperations {
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void addStudent(){
        Student student=new Student();
        student.setName("AA");
        student.setAge(18);
        student.setEmail("AA@gmail.com");
        em.persist(student);
    }
    @Transactional
    public void updateStudentsAge(int id){
        Student student=em.find(Student.class,id);
        if(student!=null){
            student.setAge(20);
        }
    }
    @Transactional
    public void deleteStudent(int id){
        Student student=em.find(Student.class,id);
        if(student!=null){
            em.remove(student);
        }
    }
}
