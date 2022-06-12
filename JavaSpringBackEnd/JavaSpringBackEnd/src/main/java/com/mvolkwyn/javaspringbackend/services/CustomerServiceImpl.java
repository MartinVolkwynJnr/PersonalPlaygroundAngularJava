package com.mvolkwyn.javaspringbackend.services;

import com.mvolkwyn.javaspringbackend.domain.Customer;
import com.mvolkwyn.javaspringbackend.domain.DomainObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CustomerServiceImpl extends AbstractMapService implements CustomerService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {
        return (Customer) super.getById(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return (Customer) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    protected void loadDomainObjects() {
        domainMap = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setEmail("micheal@burnnotice.com");
        customer1.setUsername("micheal");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setEmail("fiona@burnnotice.com");
        customer2.setUsername("fiona");

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setEmail("sam@burnnotice.com");
        customer3.setUsername("sam");

        domainMap.put(1, customer1);
        domainMap.put(2, customer2);
        domainMap.put(3, customer3);
    }
}
