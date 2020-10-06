package com.example.demo.Controller;
import com.example.demo.Dao.userDao;
import com.example.demo.Dao.userDao1;
import com.example.demo.Model.employees;
//import com.example.SpringTest.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;

@RestController
//@RequestMapping(value="/Customers")
public class emp {

    userDao userdao;


    public emp() {

        userdao = new userDao1();

    }

    //getall

    @RequestMapping(value = "/getall")

    public String getall() throws SQLException {

        return userdao.getAll().toString();

    }


    //getone

    @GetMapping(value = "/getone/{empid}")

    public String getone(@PathVariable int empid) throws SQLException {

        return userdao.getone(empid).toString();

    }


    //Create new or POST

    @RequestMapping(method = RequestMethod.POST, value = "/post")

    public void create(@RequestBody employees emp1) throws SQLException {

        userdao.create(emp1);

    }


    //update

    @RequestMapping(method = RequestMethod.PUT, value = "/put/{empid}")

    public void update(@RequestBody employees emp1, @PathVariable String empid) throws SQLException {

        userdao.update(emp1, empid);

    }


    //deleteone

    @GetMapping(value = "/delete/{empid}")

    public int ser(@PathVariable int empid) throws SQLException {

        return userdao.delete(empid);

    }
}
