
package main;

import dao.Conn;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Conn query = new Conn();
        String stmt = "SELECT * FROM BRYAN.ROLES_USER";
        
        LinkedList<String> result = query.query(stmt);
        
        /*for (int i = 0; i < result.size(); i++)
        {
            System.out.println(result.get(i));
        }*/
        
        System.out.println("result = " + result.get(0));
        System.out.println("result = " + result.get(1));
    }
}
