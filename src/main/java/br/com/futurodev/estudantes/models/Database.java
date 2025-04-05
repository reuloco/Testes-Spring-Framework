package br.com.futurodev.estudantes.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {
    private static List<Student> students = new ArrayList<>();

    private Database(){}
    public static List<Student> list(){
        return Database.students;
    }
    public static void add(Student student){
        Database.students.add(student);
    }

    public static void delete(int registro){
        Database.students.removeIf(student -> student.getRegistro().equals(registro));
    }

    public List<Student> getAllEstudantes() {
        return students;
    }

    public static Student search(Long registro){
        Optional<Student> optional_student = Database.students.stream().filter(student -> student.getRegistro().equals(registro)).findFirst();
        return optional_student.orElse(null);
    }



}
