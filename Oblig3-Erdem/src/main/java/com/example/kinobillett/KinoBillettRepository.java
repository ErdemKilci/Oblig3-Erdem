
package com.example.kinobillett;

import com.example.kinobillett.KinoBillett;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class KinoBillettRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveTicket(KinoBillett ticket) {
        String sql = "INSERT INTO KINOBILLETT(film, antall, fornavn, etternavn, telefon, epost) VALUES(?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, ticket.getFilm(), ticket.getAntall(), ticket.getFornavn(),
                ticket.getEtternavn(), ticket.getTelefonNummer(), ticket.getEpost());
    }

    public List<KinoBillett> getAllTickets() {
        String sql = "SELECT * FROM KINOBILLETT ORDER BY etternavn";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(KinoBillett.class));
    }

    public void deleteAllTickets() {
        String sql = "DELETE FROM KINOBILLETT";
        jdbcTemplate.update(sql);
    }
}
