package br.com.boloteria.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Size(min = 3, max = 20)
	private String nome;

	@NotNull
	private double preco;
	
	@NotNull
	@Size(min = 3, max = 255)
	private String ingredientes;
	
	@NotNull
	@Size(min = 3, max = 255)
	private String informacaoNutricional;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getInformacaoNutricional() {
		return informacaoNutricional;
	}

	public void setInformacaoNutricional(String informacaoNutricional) {
		this.informacaoNutricional = informacaoNutricional;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", ingredientes=" + ingredientes
				+ ", informacaoNutricional=" + informacaoNutricional + "]";
	}

	public Produto(Integer id, String nome, double preco, String ingredientes, String informacaoNutricional) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.ingredientes = ingredientes;
		this.informacaoNutricional = informacaoNutricional;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
