package br.com.boloteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.boloteria.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

	@Query(value = "SELECT * FROM pagamento", nativeQuery = true)
	List<Pagamento> findAllCat();

}