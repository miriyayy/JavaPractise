import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Address {
    private String number;
    private String apartmentName;
    private String city;

    public Address(String number, String apartmentName, String city) {
        this.number = number;
        this.apartmentName = apartmentName;
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        ArrayList<Address> addressList = new ArrayList<>();
        addressList.add(new Address("10", "Yücel Apartman", "Kocaeli"));
        addressList.add(new Address("26255", "Güzel Yalı", "Adıyaman"));
        addressList.add(new Address("27", "İlya", "Mersin"));
        addressList.add(new Address("1056", "Maria", "Adıyaman"));
        addressList.add(new Address("3625", "Florya", "İstanbul"));

        try (PrintWriter writer = new PrintWriter(new FileWriter("addresses.txt"))) {
            for (Address address : addressList) {
                writer.println(address.getNumber() + "," + address.getApartmentName() + "," + address.getCity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("addresses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String number = parts[0];
                String apartmentName = parts[1];
                String city = parts[2];

                Address address = new Address(number, apartmentName, city);
                System.out.println("Number: " + address.getNumber());
                System.out.println("Apartment Name: " + address.getApartmentName());
                System.out.println("City: " + address.getCity());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
