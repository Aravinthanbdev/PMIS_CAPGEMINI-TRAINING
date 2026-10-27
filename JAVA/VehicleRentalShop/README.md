# Vehicle Rental Shop (Java)

## Requirements
- Java 8 or newer
- No external libraries required

## Compile
Open a terminal in this folder and run:

```bash
javac *.java
```

## Run

```bash
java Main
```

## Expected output

```text
Asha rented Bike Activa (B1) for 8 days = 2880.00
Ravi rented Truck Tata Ace (T1) for 2 days = 5500.00
Error: Bike Activa (B1) is already rented
Available vehicles:
  Car Swift (C1)
  Bike Activa (B1)
```

The truck is returned before listing available vehicles. Bike rent gets a 10% discount for rentals of 7 days or longer; truck rent includes a fixed 500 insurance charge.
