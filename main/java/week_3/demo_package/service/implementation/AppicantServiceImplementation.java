package week_3.demo_package.service.implementation;

import week_3.demo_package.model.Applicants;
import week_3.demo_package.service.ApplicantService;

public class AppicantServiceImplementation implements ApplicantService {
    @Override
    public void displayApplicantData(Applicants applicants) {
        System.out.println("FullName: " + applicants.getName()
                + "\n"
                + "Age: " + applicants.getAge()
                + "\n"
                + "Gender: " + applicants.getgender());

    }

    @Override
    public void admitStudent(Applicants applicants) {
        if (applicants.getAge() >= 18) {
            System.out.println("CONGRATULATIONS!!!, You have been given admission");
        } else {
            System.out.println("You have been rejected");
        }
    }
}
