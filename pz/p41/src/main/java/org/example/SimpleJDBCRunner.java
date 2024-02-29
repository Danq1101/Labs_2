package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;


public class SimpleJDBCRunner {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        Properties prop = new Properties();
        prop.put("user", "postgres");
        prop.put("password", "postgres");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        Connection cn = null;
        try { // 1 блок
            cn = DriverManager.getConnection(url, prop);
            java.sql.Statement st = null;
            try { // 2 блок
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 блок
                    rs = st.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        int phone = rs.getInt(3);
                        String name = rs.getString(2);
                        lst.add(new Abonent(id, phone, name));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    }
                    else {
                        System.out.println("Not found");
                    }
                }
                finally { // Для 3-го блока try
// Закрыть ResultSet, если он был открыт или ошибка произошла во время чтения
                    if (rs != null) { // Был ли создан ResultSet
                        rs.close();
                    }
                    else {
                        System.err.println("Ошибка во время чтения из БД");
                    }
                }
            }
            finally {
// Закрыть Statement, если он был открыт или ошибка произошла во время создания
                if (st != null) { // Для 2-го блока try
                    st.close();
                }
                else {
                    System.err.println("Statement не создан");
                }
            }
        }
        catch (SQLException e) { // Для 1-го блока try
            System.err.println("DB connection error: " + e);
// Вывод сообщения о всех SQLException
        }
        finally {
// Закрыть Connection, если он был открыт
            if (cn != null) {
                try {
                    cn.close();
                }
                catch (SQLException e) {
                    System.err.println("Connection close error: " + e);
                }
            }
        }
    }
}