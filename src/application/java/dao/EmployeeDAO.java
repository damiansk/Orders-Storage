package application.java.dao;


import application.java.dto.EmployeeDTO;
import com.sun.istack.internal.Nullable;

import java.util.List;

public interface EmployeeDAO {

    @Nullable
    public EmployeeDTO getEmployee(int id);

    public List<EmployeeDTO> getAllEmployee();

    public void insertEmployee(EmployeeDTO employee);

    public void updateEmployee(EmployeeDTO employee);

    public void deleteEmployee(EmployeeDTO employee);

}
