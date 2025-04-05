package br.com.futurodev.estudantes.models;

import java.util.Objects;

public class Student {
    private Long registro;
    private String nome;
    private String email;


    public Student(){}
    public Student(Long registro, String nome, String email) {
        this.registro = registro;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return registro == student.registro && Objects.equals(nome, student.nome) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registro, nome, email);
    }

    public Long getRegistro() {
        return registro;
    }

    public void setRegistro(Long registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
