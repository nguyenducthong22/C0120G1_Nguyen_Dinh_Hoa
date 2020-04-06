package Clients;

import java.util.ArrayList;

public class Clients {
    public static ArrayList<String[]> getClients()
    {
        String client1[]=new String[]{
                "Le Dinh Quoc",
                "1983-08-20",
                "Ha Noi"
        };
        String client2[]=new String[]{
                "Tran Ngoc Tan",
                "1999-11-21",
                "Bac Giang"
        };

        String client3[]=new String[]{
                "Pham Minh Hung",
                "1998-04-11",
                "Tay Nguyen"
        };

        String client4[]=new String[]{
                "Pham Thai Cuong",
                "1996-08-24",
                "Vung Tau"
        };

        String client5[]=new String[]{
                "Nguyen Dinh Hoa",
                "1994-10-10",
                "Quang Nam"
        };
        ArrayList<String[]> listClients=new ArrayList<String[]>();
        listClients.add(client1);
        listClients.add(client2);
        listClients.add(client3);
        listClients.add(client4);
        listClients.add(client5);

        return listClients;
    }
}
