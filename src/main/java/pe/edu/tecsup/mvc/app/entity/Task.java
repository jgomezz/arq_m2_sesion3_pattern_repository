package pe.edu.tecsup.mvc.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    private Long id;
    private String titulo;
    private boolean completada;

    public Task() {
    }

    public Task(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.completada = false;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

}