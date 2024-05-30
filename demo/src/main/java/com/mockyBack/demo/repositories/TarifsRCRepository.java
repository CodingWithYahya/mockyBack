package com.mockyBack.demo.repositories;

import com.mockyBack.demo.entities.TarifsRC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifsRCRepository extends JpaRepository<TarifsRC, Long>, TarifsRCCustomRepository {

    /*
    @Query(value = "SELECT t.forfait + (CASE WHEN :avecRemorque = 1 THEN t.forfait * t.taux_majoration_remorque / 100 ELSE 0 END) " +
            "FROM tarifs_rc t " +
            "WHERE :codeUsage BETWEEN t.code_usage_vehicule_min AND t.code_usage_vehicule_max " +
            "AND :carburant BETWEEN t.carburant_min AND t.carburant_max " +
            "AND :puissanceFiscale BETWEEN t.puissance_fiscale_min AND t.puissance_fiscale_max " +
            "AND :ptc BETWEEN t.ptc_min AND t.ptc_max " +
            "LIMIT 1", nativeQuery = true)
    */


}
