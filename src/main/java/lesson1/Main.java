package lesson1;

import lesson1.patient.Patient;
import lesson1.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person1 = new Person("John Smith", 20);
        Person person2 = new Person("Mary Sue", 20);
        Person person3 = new Person("Daniel Damien", 30);

        Patient hivPatient1 = context.getBean("hiv", Patient.class);
        hivPatient1.setPerson(person1);

        Patient cancerPatient1 = context.getBean("cancer", Patient.class);
        cancerPatient1.setPerson(person2);

        Patient hivPatient2 = context.getBean("hiv", Patient.class);
        hivPatient2.setPerson(person3);

        System.out.println(hivPatient2.getPerson().getName() + " : " + hivPatient2.getHospital().getName() + " - " + hivPatient2.getId());
        System.out.println(cancerPatient1.getPerson().getName() + " : " + cancerPatient1.getHospital().getName() + " - " + cancerPatient1.getId());
    }
}
