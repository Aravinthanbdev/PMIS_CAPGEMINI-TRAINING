package com.quickrelief.repository;
import com.quickrelief.model.Supply;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public class SupplyRepository {
    private final JdbcTemplate jdbc;
    private final RowMapper<Supply> mapper = (rs, n) -> new Supply(rs.getLong("id"), rs.getString("item_name"), rs.getInt("quantity"));
    public SupplyRepository(JdbcTemplate jdbc) { this.jdbc = jdbc; }
    public int addOrRestock(String name, int quantity) {
        return jdbc.update("INSERT INTO supplies(item_name, quantity) VALUES (?, ?) ON DUPLICATE KEY UPDATE quantity = quantity + VALUES(quantity)", name.trim(), quantity);
    }
    public List<Supply> findAll() { return jdbc.query("SELECT id, item_name, quantity FROM supplies ORDER BY item_name", mapper); }
    public Optional<Supply> findByNameForUpdate(String name) {
        return jdbc.query("SELECT id, item_name, quantity FROM supplies WHERE item_name = ? FOR UPDATE", mapper, name.trim()).stream().findFirst();
    }
    public int deductQuantity(Long id, int quantity) {
        return jdbc.update("UPDATE supplies SET quantity = quantity - ? WHERE id = ? AND quantity >= ?", quantity, id, quantity);
    }
}
