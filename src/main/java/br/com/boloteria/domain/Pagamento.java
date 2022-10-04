package br.com.boloteria.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pagamento")
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	private boolean dinheiro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(boolean dinheiro) {
		this.dinheiro = dinheiro;
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
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", dinheiro=" + dinheiro + "]";
	}

	public Pagamento(Integer id, boolean dinheiro) {
		super();
		this.id = id;
		this.dinheiro = dinheiro;
	}

	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}

}
