package com.example.demo.Dao;
import com.example.demo.Model.employees;
 import java.sql.*;
 import java.sql.DriverManager;
 import java.util.*;
 import java.util.List;


public class userDao1 implements userDao{

    List<employees> users = new ArrayList<employees>();
    Connection conc;
    {
        try {
            conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "Nandhini", "Nandhini@4");
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    //GETALL
    public List<employees> getAll() throws SQLException {
        Statement stat= conc.createStatement();
        ResultSet res=stat.executeQuery(" select *  from emp1;");
        while(res.next()) {
            employees emp1 = new employees();
            emp1.setEmpid(res.getInt("empid"));
            emp1.setEmpname(res.getString("empname"));
           // user.setSalary(res.getInt("salary"));

            users.add(emp1);

        }
        return users;

    }
    //GETONE WITH ID

    //@Override

    public List<employees> getone(int empid) throws SQLException {
        PreparedStatement stat = conc.prepareStatement("select * from emp1 where empid= ?");
        stat.setInt(1, empid);
        ResultSet res = stat.executeQuery();
        while (res.next()) {
            employees emp1 = new employees();
            emp1.setEmpid(res.getInt("empid"));
            emp1.setEmpname(res.getString("empname"));
           // user.setSalary(res.getInt("salary"));
            users.add(emp1);
        }
        return users;
    }
    //@Override

    public void create(employees emp1) throws SQLException {
        PreparedStatement stat = conc.prepareStatement("insert into emp1 (empid,empname) values(?,?)");
        stat.setInt(1, emp1.getEmpid());
        stat.setString(2,emp1.getEmpname());
       // stat.setSalary(user.getSalary("salary"));
        stat.executeUpdate();
    }
    //@Override

    public void update(employees emp1, String id) throws SQLException {
        PreparedStatement stat = conc.prepareStatement(" UPDATE emp1 SET empname = ? WHERE empid = ?;");
        stat.setString(1,emp1.getEmpname());
        stat.setInt(4, Integer.parseInt(id));
        //stat.setSalary(user.getSalary("salary"));
        stat.executeUpdate();
    }
    //DELETE WITH ID

    //@Override

    public int delete(int empid) throws SQLException {
        PreparedStatement stat = conc.prepareStatement("delete from emp1 where empid= ?;");
        stat.setInt(1, empid);
        int res=stat.executeUpdate();
        return 0;

    }

}