package br.com.fabio.ejbtransactions;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "tbcidades")
@SequenceGenerator(name = "cidadeIdSequence", sequenceName = "tbcidades_id_seq", allocationSize = 1, initialValue = 1, schema = "public")
public class Cidade implements Serializable {

    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cidadeIdSequence")
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public Cidade() {
    }

    public Cidade(String name) {
        this.name = name;
    }

    public Cidade(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}