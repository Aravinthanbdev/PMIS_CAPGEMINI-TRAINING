CREATE TABLE IF NOT EXISTS supplies (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  item_name VARCHAR(120) NOT NULL,
  quantity INT NOT NULL,
  CONSTRAINT uq_supplies_item_name UNIQUE (item_name),
  CONSTRAINT chk_supplies_quantity CHECK (quantity >= 0)
) ENGINE=InnoDB;
CREATE TABLE IF NOT EXISTS requests (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  item_name VARCHAR(120) NOT NULL,
  quantity INT NOT NULL,
  status VARCHAR(30) NOT NULL,
  requested_by VARCHAR(120) NOT NULL,
  CONSTRAINT chk_requests_quantity CHECK (quantity > 0)
) ENGINE=InnoDB;
