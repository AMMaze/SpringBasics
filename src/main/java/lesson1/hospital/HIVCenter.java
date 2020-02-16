package lesson1.hospital;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HIVCenter implements Hospital {
    private static final String name = "HIV Center";
    private static final String address = "Address2";
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
