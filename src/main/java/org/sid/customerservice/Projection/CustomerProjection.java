package org.sid.customerservice.Projection;

import org.sid.customerservice.Entity.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullcustomer",types = Customer.class)
public interface CustomerProjection {
    public Long getId();
    public String getName();
    public String getEmail();
}
