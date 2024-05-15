package week_3.demo_package.service.implementation;

import week_3.demo_package.model.Principal;
import week_3.demo_package.service.PrincipalService;

public class PrincipalServiceImplementation implements PrincipalService {
    public void display(Principal principal){
        System.out.println("FullName: " + principal.getName()
        + "\n" + "Age: " + principal.getAge()
        + "\n" + "Gender" + principal.getgender());
    }
}
