class Car {
    private String carId;
    private String model;
    private boolean isAvailable;

    public void rentCar() { ... }
    public void returnCar() { ... }
}

class Customer {
    private String customerId;
    private String name;
    private String licenseNumber;

    public void rentCar(Car car) { ... }
    public void returnCar(Car car) { ... }
}

class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public void registerCustomer(Customer customer) { ... }
    public void listAvailableCars() { ... }
    public void rentCarToCustomer(Customer customer, String carId) { ... }

}
