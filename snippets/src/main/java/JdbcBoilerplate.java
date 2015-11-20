import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcBoilerplate {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    //<start id="jdbc_JdbcTemplate_long"/>
    public Employee getEmployeeById3(final long id) {
        return jdbcTemplate.execute("select id, firstname, lastname, salary from employee where id=?",//<co id="co_boilerplate_gone"/>
                new PreparedStatementCallback<Employee>() {
                    public Employee doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException { //<co id="co_doInPreparedStatement"/>
                        ps.setLong(1, id);
                        ResultSet rs = ps.executeQuery();
                        if (rs.next()) {
                            Employee employee = new Employee();
                            employee.setId(rs.getLong("id"));
                            employee.setFirstName(rs.getString("firstname"));
                            employee.setLastName(rs.getString("lastname"));
                            employee.setSalary(rs.getBigDecimal("salary"));
                            return employee;
                        }
                        return null;
                    }
                });
    }
    //<end id="jdbc_JdbcTemplate_long"/>

    //<start id="jdbc_JdbcTemplate_queryForObject"/>
    public Employee getEmployeeById2(long id) {
        return jdbcTemplate.queryForObject("select id, firstname, lastname, salary from employee where id=?",   //<co id="co_sql_query"/>
                new RowMapper<Employee>() {
                    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException { //<co id="co_map_the_results"/>
                        Employee employee = new Employee();
                        employee.setId(rs.getLong("id"));
                        employee.setFirstName(rs.getString("firstname"));
                        employee.setLastName(rs.getString("lastname"));
                        employee.setSalary(rs.getBigDecimal("salary"));
                        return employee;
                    }
                },
                id); // <co id="co_specify_query_params"/>
    }
    //<end id="jdbc_JdbcTemplate_queryForObject"/>

    //<start id="jdbc_Boilerplate"/>
    public Employee getEmployeeById1(long id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement("select id,firstname,lastname,salary from employee where id=?"); //<co id="co_selectEmployee"/>
            ps.setLong(1, id);
            rs = ps.executeQuery();
            Employee employee = null;
            if (rs.next()) {
                employee = new Employee();          //<co id="co_createEmployee"/>
                employee.setId(rs.getLong("id"));
                employee.setFirstName(rs.getString("firstname"));
                employee.setLastName(rs.getString("lastname"));
                employee.setSalary(rs.getBigDecimal("salary"));
            }
            return employee;
        } catch (SQLException e) {  //<co id="co_handleJdbcException"/>
            e.printStackTrace();
        } finally {
            if (rs != null) {                  //<co id="co_cleanUpJdbcMess"/>
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    //<end id="jdbc_Boilerplate"/>
}

class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}


