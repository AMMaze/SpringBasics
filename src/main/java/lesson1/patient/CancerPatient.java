package lesson1.patient;

import lesson1.hospital.CancerCenter;
import lesson1.hospital.Hospital;
import lesson1.person.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("cancer")
@Scope("prototype")
public class CancerPatient implements Patient {
    Person person;
    int id;

    CancerCenter hospital;

    public CancerPatient(CancerCenter hospital) {
        this.hospital = hospital;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public Hospital getHospital() {
        return hospital;
    }

    @PostConstruct
    private void init() {
        id = hospital.addPatient();
    }

    public int getId() {
        return id;
    }
}
