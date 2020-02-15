package lesson1.hospital;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CancerCenter implements Hospital {
    private static final String name = "Cancer Center";
    private static final String address = "Address1";
    private static final int capacity = 100;

    private static int numberOfPatients = 0;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int addPatient() {
        numberOfPatients += 1;
        return numberOfPatients;
    }
}
