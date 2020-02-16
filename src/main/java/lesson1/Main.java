package lesson1;

import lesson1.patient.Patient;
import lesson1.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:config.xml");
        Person person1 = new Person("John Smith", 20);
        Person person2 = new Person("Mary Sue", 20);
        Person person3 = new Person("Daniel Damien", 30);
        Person person4 = new Person("Vivian Rook", 30);

        Patient hivPatient1 = xmlContext.getBean("hiv", Patient.class);
        hivPatient1.setPerson(person1);

        Patient cancerPatient1 = xmlContext.getBean("cancer", Patient.class);
        cancerPatient1.setPerson(person2);

        Patient hivPatient2 = xmlContext.getBean("hiv", Patient.class);
        hivPatient2.setPerson(person3);

        Patient cancerPatient2 = xmlContext.getBean("cancer", Patient.class);
        cancerPatient2.setPerson(person4);

        System.out.println(hivPatient2.getPerson().getName() + " : " + hivPatient2.getHospital().getName() + " - " + hivPatient2.getId());
        System.out.println(cancerPatient2.getPerson().getName() + " : " + cancerPatient2.getHospital().getName() + " - " + cancerPatient2.getId());
    }
}
