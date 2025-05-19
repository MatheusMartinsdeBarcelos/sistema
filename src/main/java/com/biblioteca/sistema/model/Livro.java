package com.biblioteca.sistema.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "livro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String autor;

    private String editora;

    private Integer anoPublicacao;

    @Column(unique = true)
    private String isbn;

    private Integer quantidade = 1;
}
