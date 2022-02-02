import Comparator.*;
import universitets.*;
import io.XlsReader;
import model.Student;
import model.University;
import UTILITY.util ;

import java.io.IOException;
import java.util.List;

public class main_class {

    public static void main(String[] args) throws IOException {

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        universityComparator universityComparator =
                util.getUniversityComparator(university_compartor.YEAR_OF_FOUNDATION);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                util.getStudentComparator(students_comparator.AVGEXAMSCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}
