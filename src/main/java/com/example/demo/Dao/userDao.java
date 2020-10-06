package com.example.demo.Dao;
import com.example.demo.Model.employees;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import java.sql.SQLException;
import java.util.List;
public interface userDao  {
    List<employees> getAll() throws SQLException;

    //getone
    List<employees> getone(int empid) throws SQLException;

    //CREATE
    void create(employees emp1) throws SQLException;

    //UPDATE
    void update(employees emp1, String id) throws SQLException;

    //DELETE
    public int delete(int empid) throws SQLException;


}