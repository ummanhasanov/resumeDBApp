/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao.inter;

import com.mycompany.entity.EmploymentHistory;
import java.util.List;

/**
 *
 * @author Umman Hasan
 */
public interface EmploymentHistoryDaoInter
{

    public List<EmploymentHistory> getAllEmploymentHistoryById(int userId);

}
