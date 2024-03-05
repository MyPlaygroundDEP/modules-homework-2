package lk.ijse.project_c.repo;

import ijse.project_b.service.CustomerService;
import lk.ijse.project_c.security.RepoSecurity;
import lk.ijse.project_e.component.CustomerComponent;
import lk.ijse.project_f.config.*;


public class CustomerRepo {
    RepoSecurity repoSecurity;
    CustomerService customerService;
    AppConfig appConfig;
    CustomerComponent component;

}
