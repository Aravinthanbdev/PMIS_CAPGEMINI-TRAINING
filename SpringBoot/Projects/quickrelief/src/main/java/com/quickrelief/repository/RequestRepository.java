package com.quickrelief.repository;
import com.quickrelief.model.SupplyRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class RequestRepository {
    private final JdbcTemplate jdbc;
    private final RowMapper<SupplyRequest> mapper = (rs, n) -> new SupplyRequest(rs.getLong("id"), rs.getString("item_name"), rs.getInt("quantity"), rs.getString("status"), rs.getString("requested_by"));
    public RequestRepository(JdbcTemplate jdbc) { this.jdbc = jdbc; }
    public SupplyRequest create(String name, int quantity, String status, String requestedBy) {
        jdbc.update("INSERT INTO requests(item_name, quantity, status, requested_by) VALUES (?, ?, ?, ?)", name.trim(), quantity, status, requestedBy.trim());
        Long id = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Long.class);
        return jdbc.queryForObject("SELECT id, item_name, quantity, status, requested_by FROM requests WHERE id = ?", mapper, id);
    }
}
