# QuickRelief — Campus Emergency Supply Tracker

A lightweight REST API for tracking emergency supplies and allocating medical kits / food packets.

## Stack
- Java 17+, Spring Boot 3.3.5, Maven
- MySQL 8+, Spring JdbcTemplate, explicit SQL, custom RowMapper
- No JPA, Hibernate, or Spring Data JPA

## Features
- `POST /api/supplies`: create an item or restock an existing item by adding quantity.
- `GET /api/supplies`: list all inventory.
- `POST /api/requests`: validate stock, deduct quantity, and record allocation in one transaction.
- MySQL `SELECT ... FOR UPDATE` row locking helps avoid concurrent over-allocation.
- Validation for blank fields and quantities below 1.

## Prerequisites
Install JDK 17+, Maven 3.6+, and MySQL 8+.

## Database setup
Run this once in MySQL:
```sql
CREATE DATABASE quickrelief;
```
Tables are initialized automatically at startup from `src/main/resources/schema.sql`.

## Configure database credentials
Defaults in `application.properties` are username `root`, password `root`, database `quickrelief`. Change these for your local MySQL setup, or set environment variables.

Windows PowerShell:
```powershell
$env:DB_URL="jdbc:mysql://localhost:3306/quickrelief?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC"
$env:DB_USERNAME="root"
$env:DB_PASSWORD="your_mysql_password"
```
macOS / Linux:
```bash
export DB_URL='jdbc:mysql://localhost:3306/quickrelief?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC'
export DB_USERNAME='root'
export DB_PASSWORD='your_mysql_password'
```

## Run
From the project folder:
```bash
mvn clean spring-boot:run
```
API base URL: `http://localhost:8080`

Build a JAR:
```bash
mvn clean package
java -jar target/campus-emergency-supply-tracker-1.0.0.jar
```

## Endpoints

### Add or restock supplies
`POST /api/supplies`
```json
{"itemName":"Medical Kit","quantity":25}
```
Repeated calls for the same exact item name add to existing quantity.

### List supplies
`GET /api/supplies`
Example:
```json
[{"id":1,"itemName":"Medical Kit","quantity":25}]
```

### Allocate a supply
`POST /api/requests`
```json
{"itemName":"Medical Kit","quantity":3,"requestedBy":"Campus Health Centre"}
```
Success is `201 Created`, with a request record containing status `ALLOCATED`.

Errors:
- `404 Not Found`: item does not exist.
- `409 Conflict`: insufficient stock.
- `400 Bad Request`: invalid request fields.

## Postman
1. Import `postman/QuickRelief.postman_collection.json` into Postman.
2. Start MySQL and the Spring Boot app.
3. Run the collection in order: add medical kits, add food packets, list supplies, valid allocation, over-stock allocation (expect 409), unknown item (expect 404).
4. The collection uses `{{baseUrl}}`, defaulting to `http://localhost:8080`.

## Transaction safety
`RequestService.allocate()` uses `@Transactional`. It locks the inventory row, checks availability, deducts quantity, and inserts the allocation record. Runtime failures roll back both database changes.

## Project structure
```text
src/main/java/com/quickrelief/
  QuickReliefApplication.java
  controller/ (SupplyController, RequestController)
  dto/ (AddSupplyRequest, CreateRequest)
  model/ (Supply, SupplyRequest)
  repository/ (SupplyRepository, RequestRepository)
  service/ (SupplyService, RequestService)
src/main/resources/ (application.properties, schema.sql)
postman/QuickRelief.postman_collection.json
```

This is a starter implementation for the supplied brief; authentication and production hardening are out of scope.
