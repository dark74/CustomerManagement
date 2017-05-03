package service;

import dao.CustomerDao;
import domain.Customer;
import domain.PageBean;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by codingBoy on 16/10/23.
 */
public class CustomerService
{
    CustomerDao customerDao=new CustomerDao();

    public void add(Customer customer)
    {
        customerDao.add(customer);
    }

//    public List<Customer> findAll()
//    {
//        return customerDao.findAll();
//    }
    public PageBean<Customer> findAll(int pc,int pr) throws SQLException {
        return customerDao.findAll(pc,pr);
    }

    public Customer find(String id) throws SQLException {
        return customerDao.find(id);
    }

    public void edit(Customer customer)
    {
        customerDao.edit(customer);
    }

    public void delete(String id)
    {
        customerDao.delete(id);
    }

    public PageBean<Customer> query(Customer customer,int pc,int pr)
    {
        return customerDao.query(customer,pc,pr);


    }

}
