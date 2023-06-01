package com.example.springbootgradle.study.model;

import java.sql.*;
import java.util.List;

public class DBMain extends BaseDAO{
    public static void main(String[] args) throws SQLException {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println(personDAO.insertPerson("leo"));
        System.out.println(personDAO.insertPerson("yui"));
        List<Person> personList = personDAO.findAllPerson();
        System.out.println(personList.toString());
        System.out.println(personDAO.findByNamePerson("bab"));
    }
}
