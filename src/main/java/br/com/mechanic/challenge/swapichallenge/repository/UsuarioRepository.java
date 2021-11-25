package br.com.mechanic.challenge.swapichallenge.repository;

import java.util.Optional;

import br.com.mechanic.challenge.swapichallenge.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByEmail(String email);

    @Modifying
    @Query("update Usuario u set u.senha = :senha where u.codigo = :codigo")
    public void updateSenhaByCodigo(@Param(value = "codigo") Long codigo, @Param(value = "senha") String senha );
}
