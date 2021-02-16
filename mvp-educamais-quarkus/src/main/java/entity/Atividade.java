package entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Atividade extends PanacheEntity {

	@Column
    private LocalDate data;

    @Column
    private Boolean estado;

    @Column
    private String nome;

    @Column
    private BigDecimal nota;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getNota() {
		return nota;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}

	public Atividade() {
	}

	public Atividade(LocalDate data, Boolean estado, String nome, BigDecimal nota) {
		super();
		this.data = data;
		this.estado = estado;
		this.nome = nome;
		this.nota = nota;
	}

}
