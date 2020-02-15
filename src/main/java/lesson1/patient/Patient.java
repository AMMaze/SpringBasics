package lesson1.patient;

import lesson1.hospital.Hospital;
import lesson1.person.Person;

public interface Patient {

    Person getPerson();

    void setPerson(Person person);

    Hospital getHospital();

    int getId();
}
