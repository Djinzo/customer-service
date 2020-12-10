package org.sid.customerservice.Repository;


import org.sid.customerservice.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;


@RepositoryRestController
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
