package com.ibm.sample;

import java.sql.*;
import java.io.*;

public class JavaSpikeTester
{
    public static void main(String[] args)
    {
        try
        {

            int a[] = { 1, 2, 3 };
            String b[] = { "foo1", "foo2", "foo3" };
            String v = "A" + args[0] + "Z";

            Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
 
            out.write(1);
            out.write(a[0]);

            out.write("Hello");
            out.write(v);

            Connection conn = DriverManager.getConnection("FOO","BAR","BAS");
            Statement stmt = conn.createStatement();
            boolean b01 = stmt.execute("FOO");

            String q;
            if (b01)
              q = "ZZZ";
            else
              q = "AAAA";
            boolean b02 = stmt.execute(q);
            boolean b03 = stmt.execute(v);

            stmt.addBatch("select * from foo where name='bar0'");

            boolean b04a = stmt.execute("select * from foo where name='bat1'",
                                        Statement.RETURN_GENERATED_KEYS );
            boolean b04b = stmt.execute(v, Statement.RETURN_GENERATED_KEYS );

            boolean b05a = stmt.execute("select * from foo where name='bat2'", a);
            boolean b05b = stmt.execute(v, a);

            boolean b06a = stmt.execute("select * from foo where name='bat3'", b);
            boolean b06b = stmt.execute(v, b);

            ResultSet rs1a = stmt.executeQuery("select * from foo where name='bat4'");
            ResultSet rs1b = stmt.executeQuery(v);

            int eu1a = stmt.executeUpdate("FOO");
            int eu1b = stmt.executeUpdate(v);

            PreparedStatement ps1a = conn.prepareStatement("select * from foo where name='bar1'");
            PreparedStatement ps1b = conn.prepareStatement(v);

            PreparedStatement ps2a = conn.prepareStatement("select * from foo where name='bar2'",
                                                           Statement.NO_GENERATED_KEYS );
            PreparedStatement ps2b = conn.prepareStatement(v, Statement.NO_GENERATED_KEYS );

            PreparedStatement ps3a = conn.prepareStatement("select * from foo where name='bar3'",
                                                           ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                           ResultSet.CONCUR_READ_ONLY );
            PreparedStatement ps3b = conn.prepareStatement(v,
                                                           ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                           ResultSet.CONCUR_READ_ONLY );


            PreparedStatement ps4a = conn.prepareStatement("select * from foo where name='bar4'",
                                                           ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                           ResultSet.CONCUR_READ_ONLY,
                                                           ResultSet.CLOSE_CURSORS_AT_COMMIT  );
            PreparedStatement ps4b = conn.prepareStatement(v,
                                                           ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                           ResultSet.CONCUR_READ_ONLY,
                                                           ResultSet.CLOSE_CURSORS_AT_COMMIT  );

            PreparedStatement ps5a = conn.prepareStatement("select * from foo where name='bar5'", a);
            PreparedStatement ps5b = conn.prepareStatement(v, a);

            PreparedStatement ps6a = conn.prepareStatement("select * from foo where name='bar6'", b);
            PreparedStatement ps6b = conn.prepareStatement(v, b);

            CallableStatement cs1a = conn.prepareCall("foo1");
            CallableStatement cs1b = conn.prepareCall(v);

            CallableStatement cs2a = conn.prepareCall("foo2",
                                                      ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY );
            CallableStatement cs2b = conn.prepareCall(v,
                                                      ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY );

            CallableStatement cs3a = conn.prepareCall("foo3",
                                                      ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY,
                                                      ResultSet.CLOSE_CURSORS_AT_COMMIT );
            CallableStatement cs3b = conn.prepareCall(v,
                                                      ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY,
                                                      ResultSet.CLOSE_CURSORS_AT_COMMIT );

        }
        catch(Exception e){}
    }
}
