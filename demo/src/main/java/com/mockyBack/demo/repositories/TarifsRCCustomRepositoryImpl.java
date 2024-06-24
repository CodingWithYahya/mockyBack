package com.mockyBack.demo.repositories;

import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.repositories.TarifsRCCustomRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Repository
public class TarifsRCCustomRepositoryImpl implements TarifsRCCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /*@Override
    public Double calculatePrime(ChapeauPayload payload) {
        return calculatePrimeInternal(
                Integer.parseInt(payload.getCodeUsageVehicule()),
                Integer.parseInt(payload.getCarburant()),
                payload.getPuissanceFiscale(),
                payload.getPtc(),
                payload.getNombreRemorquesTractes()
//                payload.getNombrePlace()
        );
    }*/

//    public Double calculatePrime(OffrePayload payload) {
//        return calculatePrimeInternal(
//                Integer.parseInt(payload.getCodeUsageVehicule()),
//                Integer.parseInt(payload.getCarburant()),
//                payload.getPuissanceFiscale(),
//                payload.getPtc(),
//                payload.getNombreRemorquesTractes()
//                payload.getNombrePlace()
//        );
//    }

    /*
    private Double calculatePrimeInternal(int codeUsage, int carburant, int puissanceFiscale, int ptc, int nombreRemorques, String nombrePlacesStr) {
        String sql = "SELECT t.forfait + (CASE WHEN :avecRemorque = 1 THEN t.forfait * t.taux_majoration_remorque ELSE 0 END) " +
                "FROM tarifs_rc t " +
                "WHERE :codeUsage BETWEEN t.code_usage_vehicule_min AND t.code_usage_vehicule_max " +
                "AND :carburant BETWEEN t.carburant_min AND t.carburant_max " +
                "AND :puissanceFiscale BETWEEN t.puissance_fiscale_min AND t.puissance_fiscale_max " +
                "AND :ptc BETWEEN t.ptc_min AND t.ptc_max " +
                //"AND :nbrPlaces <= t.forfait_nre_place " +
                "LIMIT 1";

        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("codeUsage", codeUsage);
        query.setParameter("carburant", carburant);
        query.setParameter("puissanceFiscale", puissanceFiscale);
        query.setParameter("ptc", ptc);
        query.setParameter("avecRemorque", nombreRemorques);

//        int nombrePlaces = 0;
//        if (nombrePlacesStr != null && !nombrePlacesStr.isEmpty()) {
//            nombrePlaces = Integer.parseInt(nombrePlacesStr);
//        }
//        query.setParameter("nbrPlaces", nombrePlaces);
        return (Double) query.getResultStream().findFirst().orElse(0.0);    //getSingleResult();
//        return result != null ? ((Number) result).doubleValue() : 0.0;
    }*/

    @Override
    public Double calculatePrime(ChapeauPayload payload) {
        String sql = "SELECT t.forfait + (CASE WHEN :avecRemorque = 1 THEN t.forfait * t.taux_majoration_remorque ELSE 0 END) " +
                "FROM tarifs_rc t " +
                "WHERE :codeUsage BETWEEN t.code_usage_vehicule_min AND t.code_usage_vehicule_max " +
                "AND :carburant BETWEEN t.carburant_min AND t.carburant_max " +
                "AND :puissanceFiscale BETWEEN t.puissance_fiscale_min AND t.puissance_fiscale_max " +
                "AND :ptc BETWEEN t.ptc_min AND t.ptc_max " +
                // "AND :nbrPlaces <= t.forfait_nre_place " +
                "LIMIT 1";

        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("codeUsage", Integer.parseInt(payload.getCodeUsageVehicule()));
        query.setParameter("carburant", Integer.parseInt(payload.getCarburant()));
        query.setParameter("puissanceFiscale", payload.getPuissanceFiscale());
        query.setParameter("ptc", payload.getPtc());
        query.setParameter("avecRemorque", payload.getNombreRemorquesTractes());
        //query.setParameter("nbrPlaces" , Integer.parseInt(payload.getNombrePlace()));
        // Handling the case where nombrePlace might be empty
        int nombrePlaces = 0;
        if (payload.getNombrePlace() != null && !payload.getNombrePlace().isEmpty()) {
            nombrePlaces = Integer.parseInt(payload.getNombrePlace());
        }
        // query.setParameter("nbrPlaces", nombrePlaces);

        query.setParameter("avecRemorque", payload.getNombreRemorquesTractes());

        Object result = query.getSingleResult();
        return result != null ? ((Number) result).doubleValue() : 0.0;
    }
}
