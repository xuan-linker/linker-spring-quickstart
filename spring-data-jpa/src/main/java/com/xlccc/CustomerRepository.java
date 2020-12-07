package com.xlccc;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Linker
 * @date 2020/12/7 10:09
 * @description：
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}