package com.company.nakleika.entity.employee;

import com.company.nakleika.entity.client.Client;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "NAKLEIKA_EMPLOYEE")
@Entity(name = "nakleika_Employee")
public class Employee extends Client {
    private static final long serialVersionUID = 7068132730886106308L;
}