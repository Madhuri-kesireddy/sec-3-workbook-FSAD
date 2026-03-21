package com.klu;
import java.sql.*;

public class JDBCCrud {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String url="jdbc:mysql://localhost:3306/fsads3";
    String usr="root";
    String pwd="root";
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,usr,pwd);
    System.out.println("Database Connection Established");
    Statement st=con.createStatement();
    String createDept="create table if not exists Dept("+
                       "dept_id int primary key auto_increment,"+
                    "dept_name varchar(20) "+")";
    st.execute(createDept);
    System.out.println("Department table created");
    
    st.execute(
          "CREATE TABLE IF NOT EXISTS Emp (" +
          "emp_id INT PRIMARY KEY AUTO_INCREMENT, " +
          "emp_name VARCHAR(50), " +
          "salary DOUBLE, " +
          "dept_id INT, " +
          "FOREIGN KEY (dept_id) REFERENCES Dept(dept_id)" +
          ")"
      );

    
    
    System.out.println("Employee table created");

  
    st.executeUpdate(
          "INSERT INTO Dept VALUES ('ECE')"
      );
      System.out.println("Dept updated");


      st.executeUpdate(
            "INSERT INTO Emp VALUES ('Madhuri',200000,101)"
        );
        System.out.println("Emp updated");

    }
    
    catch(Exception e) {
      e.printStackTrace();
    }

  }

}