package objectdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressObject extends GeneralObject {
    private String lastName;
    private String firstName;
    private String street;
    private String streetNumber;
    private String blockNumber;
    private String stairsNumber;
    private String apartmentNumber;
    private String deliveryDetails;
    private String postalCode;
    private String city;
    private String county;
    private String country;

    public AddressObject(String filepath) {
        fromJsonToObject(filepath);
    }
}


