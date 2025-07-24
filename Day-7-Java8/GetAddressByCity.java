import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', street='" + street + "'}";
    }
}

public class GetAddressByCity {
    public static void main(String[] args) {
                List<Address> addressList = Arrays.asList(
                new Address("Hyderabad", "Madhapur"),
                new Address("Bangalore", "Whitefield"),
                new Address("Hyderabad", "Kukatpally"),
                new Address("Chennai", "T. Nagar")
        );

        String targetCity = "Hyderabad";

        // Filter addresses by city
        List<Address> result = addressList.stream()
                .filter(addr -> addr.getCity().equalsIgnoreCase(targetCity))
                .collect(Collectors.toList());

        // Output
        System.out.println("Addresses in city \"" + targetCity + "\":");
        result.forEach(System.out::println);
    
    }
}
