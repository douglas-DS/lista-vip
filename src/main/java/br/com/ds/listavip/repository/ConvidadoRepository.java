package br.com.ds.listavip.repository;

import br.com.ds.listavip.models.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
}
