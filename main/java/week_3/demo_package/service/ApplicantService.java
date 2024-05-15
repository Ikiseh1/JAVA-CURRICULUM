package week_3.demo_package.service;

import week_3.demo_package.model.Applicants;

public interface ApplicantService {

    void displayApplicantData(Applicants applicants);

    void admitStudent(Applicants applicant);
}
