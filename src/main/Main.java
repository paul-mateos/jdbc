
<<<<<<< HEAD
package src.main;
import src.db.*;
=======
package javadb.src.main;
import javadb.src.db.*;
>>>>>>> origin/master

public class Main {
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB("jdbc:mysql://192.168.1.2:3306", "root", "root");
        db.openConnection();
    }
}
