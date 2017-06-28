package com.ibm.sample;

import java.util.*;
import java.sql.*;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;

import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.jsp.tagext.*;

public class JavaAny
{
    
	public static void test_Cookie() {
        try
        {
        Cookie c = new Cookie("name","value");
        Cookie c2 = (Cookie)c.clone();  
        String s1 = c.getComment();
        String s2 = c.getDomain();
        String s3 = c.getName();
        String s4 = c.getPath();
        String s5 = c.getValue();
        String s6 = c.getComment();
        c.setComment("value");
        c.setDomain("value");
        c.setPath("value");
        c.setValue("value");
        
        }
        catch(Exception e){}
    }

	public static void test_HttpServletRequest(HttpServletRequest hsr) {
        try
        {
        long l = hsr.getDateHeader("string");
        String s1 = hsr.getHeader("string");
        Enumeration e1 = hsr.getHeaderNames();
        Enumeration e2 = hsr.getHeaders("string");
        String s2 = hsr.getPathInfo();
        String s3 = hsr.getPathTranslated();
        String s4 = hsr.getQueryString();
        String s5 = hsr.getRequestURI();
        StringBuffer sb = hsr.getRequestURL();
        String s6 = hsr.getRequestedSessionId();    
        }
        catch(Exception e){}
    }
	
	public static void test_HttpServletRequestWrapper() {
        try
        {
        HttpServletRequestWrapper hsrw = new HttpServletRequestWrapper(null);
        long l = hsrw.getDateHeader("string");
        String s1 = hsrw.getHeader("string");
        Enumeration e1 = hsrw.getHeaderNames();
        Enumeration e2 = hsrw.getHeaders("string");
        String s2 = hsrw.getPathInfo();
        String s3 = hsrw.getPathTranslated();
        String s4 = hsrw.getQueryString();
        String s5 = hsrw.getRequestURI();
        StringBuffer sb = hsrw.getRequestURL();
        String s6 = hsrw.getRequestedSessionId();    
        }
        catch(Exception e){}
    }
	public static void test_ServletRequest(ServletRequest sr) {
        try
        {
        int i1 = sr.getContentLength();
        String s1 = sr.getContentType();
        Locale L1 = sr.getLocale();
        Enumeration e1 = sr.getLocales();
        String s2 = sr.getParameter("string");
        Map m1 = sr.getParameterMap();
        Enumeration e2 = sr.getParameterNames();
        String[] sa = sr.getParameterValues("string");
		String s3 = sr.getProtocol();																				   
		String s4 = sr.getRemoteAddr();
		String s5 = sr.getRemoteHost();
		int i2 = sr.getRemotePort();
		String s6 = sr.getScheme();
		int i3 = sr.getServerPort();

        }
        catch(Exception e){}
    }
	
	public static void test_ServletRequestWrapper(ServletRequestWrapper srw) {
        try
        {	
        int i1 = srw.getContentLength();
        String s1 = srw.getContentType();
        Locale L1 = srw.getLocale();
        Enumeration e1 = srw.getLocales();
        String s2 = srw.getParameter("string");
        Map m1 = srw.getParameterMap();
        Enumeration e2 = srw.getParameterNames();
        String[] sa = srw.getParameterValues("string");
		String s3 = srw.getProtocol();																				   
		String s4 = srw.getRemoteAddr();
		String s5 = srw.getRemoteHost();
		int i2 = srw.getRemotePort();
		String s6 = srw.getScheme();
		int i3 = srw.getServerPort();
		srw.setAttribute("string",null);
		
        }
        catch(Exception e){}
    }
	
	public static void test_HttpServletResponse(HttpServletResponse hsr) {
        try
        {
        Cookie c = new Cookie("name","value");	
        hsr.addCookie(c);
        hsr.addDateHeader("string",1L);
        hsr.sendError(3);
        hsr.sendError(613,"string");
        hsr.setDateHeader("string",1L);
        
        }
        catch(Exception e){}
    }
	public static void test_HttpServletResponseWrapper(HttpServletResponseWrapper hsrw) {
        try
        {
        Cookie c = new Cookie("name","value");	
        hsrw.addCookie(c);
        hsrw.addDateHeader("string",1L);
        hsrw.sendError(3);
        hsrw.sendError(613,"string");
        hsrw.setDateHeader("string",1L);
        
        }
        catch(Exception e){}
    }
	public static void test_FilterConfig(FilterConfig fc) {
        try
        {
        String s1 = fc.getInitParameter("string");
        Enumeration e1 = fc.getInitParameterNames();	

        }
        catch(Exception e){}
    }	
	public static void test_ServletConfig(ServletConfig sc) {
        try
        {
        String s1 = sc.getInitParameter("string");
        Enumeration e1 = sc.getInitParameterNames();	

        }
        catch(Exception e){}
    }	
	public static void test_ServletContext(ServletContext sc) {
        try
        {
        String s1 = sc.getInitParameter("string");
        Enumeration e1 = sc.getInitParameterNames();	
        Servlet ss1 = sc.getServlet("string");
        Enumeration e2 = sc.getServletNames();
        Enumeration e3 = sc.getServlets();
        
        }
        catch(Exception e){}
    }
	
	public static void test_ServletException(ServletException se) {
        try
        {
        Throwable t1 = se.getRootCause();
        }
        catch(Exception e){}
    }
	public static void test_UnavailableException(UnavailableException ue) {
        try
		{
        Servlet ss1 = ue.getServlet();
        int i1 = ue.getUnavailableSeconds();
        boolean b1 = ue.isPermanent();
        	
        }
        catch(Exception e){}
    }
	
	
	public static void test_GenericServlet(GenericServlet gs) {
        try
        {
        String s1 = gs.getInitParameter("string");
        Enumeration e1 = gs.getInitParameterNames();
 
        }
        catch(Exception e){}
    }
	public static void test_ErrorData(ErrorData ed) {
        try
        {
        String s1 = ed.getRequestURI();
        String s2 = ed.getServletName();
        int i1 = ed.getStatusCode();
        Throwable t1 = ed.getThrowable();
        }
        catch(Exception e){}
    }
	
	public static void test_ServletResponse(ServletResponse sr) {
        try
        {
		String s1 = sr.getContentType();
        }
        catch(Exception e){}
    }
	public static void test_ServletResponseWrapper(ServletResponseWrapper srw) {
        try
        {
        String s1 = srw.getContentType();
      
        }
        catch(Exception e){}
    }
	public static void test_ServletInputStream(ServletInputStream sis) {
        try
        {
        String s1 = "string"; 
		byte[] ba = s1.getBytes();
		int i1 = sis.readLine(ba, 333, 444);
      
        }
        catch(Exception e){}
    }
	
	public static void test_PageContext(PageContext pc) {
        try
        {
        ErrorData ed = pc.getErrorData();
      
        }
        catch(Exception e){}
    }
	public static void test_BodyContent(BodyContent bc) {
        try
        {
        String s1 = bc.getString();
      
        }
        catch(Exception e){}
    }
	
	public static void test_DataInput(DataInput di) {
        try
        {
        boolean b1 = di.readBoolean();
        byte by1 = di.readByte();
        char c1 = di.readChar();
        double d1 = di.readDouble();
        float f1 = di.readFloat();
        String s1 = "string"; 
		byte[] ba = s1.getBytes();
		di.readFully(ba);
		di.readFully(ba, 666, 666);
		int i1 = di.readInt();
		String s2 = di.readLine();
		long l1 = di.readLong();
		short sh1 = di.readShort();
		String s3 = di.readUTF();
		int i2 = di.readUnsignedByte();
		int i3 = di.readUnsignedShort();
      
        }
        catch(Exception e){}
    }
	public static void test_DataInputStream(DataInputStream dis) {
        try
        {

        boolean b1 = dis.readBoolean();
        byte by1 = dis.readByte();
        char c1 = dis.readChar();
        double d1 = dis.readDouble();
        float f1 = dis.readFloat();
        String s1 = "string"; 
		byte[] ba = s1.getBytes();
		dis.readFully(ba);
		dis.readFully(ba, 666, 444);
		int i1 = dis.readInt();
		String s2 = dis.readLine();
		long l1 = dis.readLong();
		short sh1 = dis.readShort();
		String s3 = dis.readUTF();
		int i2 = dis.readUnsignedByte();
		int i3 = dis.readUnsignedShort();
        int i4 = dis.read(ba);
    	int i5 = dis.read(ba, 333, 222);
    	String s4 = dis.readUTF(null);
		
        }
        catch(Exception e){}
    }
	
	public static void test_DataOutput(DataOutput dout) {
        try
        {
        String s1 = "string"; 
    	byte[] ba = s1.getBytes();
    	dout.write(ba);
    	dout.write(ba, 888, 777);
    	dout.write(999);
    	dout.writeBoolean(true);
    	dout.writeByte(555);
    	dout.writeBytes("string");
    	dout.writeChar(555);
    	dout.writeChars("string");
    	dout.writeDouble(1.0);
    	dout.writeFloat(1f);
    	dout.writeInt(345);
    	dout.writeLong(1L);
    	dout.writeShort(1);
    	dout.writeUTF("string");

        }
        catch(Exception e){}
    }
	public static void test_FileInputStream(FileInputStream fis) {
        try
        {
        int i1 = fis.read();
        String s1 = "string"; 
    	byte[] ba = s1.getBytes();
    	int i2 = fis.read(ba);
    	int i3 = fis.read(ba, 123, 345);

        }
        catch(Exception e){}
    }
	public static void test_FilterInputStream(FilterInputStream fis) {
        try
        {
        int i1 = fis.read();
        String s1 = "string"; 
    	byte[] ba = s1.getBytes();
    	int i2 = fis.read(ba);
    	int i3 = fis.read(ba, 123, 345);

        }
        catch(Exception e){}
    }
	public static void test_FilterReader(FilterReader fr) {
        try
        {
        char[] ch1 = {'a','b'};
        int i1 = fr.read();
        int i2 = fr.read(ch1,456,789);
        }
        catch(Exception e){}
    }
	public static void test_InputStream(InputStream is) {
        try
        {
            int i1 = is.read();
            String s1 = "string"; 
        	byte[] ba = s1.getBytes();
        	int i2 = is.read(ba);
        	int i3 = is.read(ba, 123, 345);
        }
        catch(Exception e){}
    }
	
	public static void test_InputStreamReader(InputStreamReader isr) {
        try
        {
        char[] ch1 = {'a','b'};
        int i1 = isr.read();
        int i2 = isr.read(ch1,456,789);
        }
        catch(Exception e){}
    }
	public static void test_LineNumberInputStream(LineNumberInputStream lnis) {
        try
        {
        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        int i1 = lnis.read();
        int i2 = lnis.read(ba,456,789);
        }
        catch(Exception e){}
    }
	public static void test_LineNumberReader(LineNumberReader lnr) {
        try
        {
        char[] ch1 = {'a','b'};
        int i1 = lnr.read();
        int i2 = lnr.read(ch1,456,789);
        String s1 = lnr.readLine();

        }
        catch(Exception e){}
    }
	
	public static void test_BufferedReader(BufferedReader br) {
        try
        {
        char[] ch1 = {'a','b'};
        int i1 = br.read();
        int i2 = br.read(ch1,456,789);
        String s1 = br.readLine();
        }
        catch(Exception e){}
    }
	public static void test_BufferedWriter(BufferedWriter bw) {
        try
        {
        char[] ch1 = {'a','b'};
        bw.write(234);
        bw.write(ch1,456,789);
        bw.write("string", 567, 678);

        }
        catch(Exception e){}
    }
	
	public static void test_BufferedInputStream(BufferedInputStream bis) {
        try
        {

        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        int i1 = bis.read();
        int i2 = bis.read(ba, 613, 201);

        }
        catch(Exception e){}

	}
	public static void test_ObjectInput(ObjectInput oi) {
        try
        {

        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        int i1 = oi.read();
        int i2 = oi.read(ba, 613, 201);
        int i3 = oi.read(ba);
        Object obj = oi.readObject();

        }
        catch(Exception e){}

	}
	public static void test_ObjectInputStream(ObjectInputStream ois) {
        try
        {

        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        ois.defaultReadObject();
        int i1 = ois.read();
        int i2 = ois.read(ba, 678, 123);
        boolean bool1 = ois.readBoolean();
        byte b1 = ois.readByte();
        char c1 = ois.readChar();
        double d1 = ois.readDouble();
      //  ObjectInputStream$GetField gf = ois.readFields();
        float f = ois.readFloat();
        ois.readFully(ba);
        ois.readFully(ba, 234, 444);
        int i3 = ois.readInt();
        String s2 = ois.readLine();
		long L = ois.readLong();
		Object obj1 = ois.readObject();
		short st1 = ois.readShort();
		String s4 = ois.readUTF();
		Object obj4 = ois.readUnshared();
		int i4 = ois.readUnsignedByte();
		int i5 = ois.readUnsignedShort();

        }
        catch(Exception e){}

	}
	
	public static void test_OutputStreamWriter(OutputStreamWriter osw) {
        try
        {

        char[] ch1 = {'a','b'};
        osw.write(ch1, 123, 234);
        osw.write(4444);
        osw.write("string", 5, 6);

        }
        catch(Exception e){}

	}
	
	public static void test_PipedInputStream(PipedInputStream pis) {
        try
        {

        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        int i1 = pis.read();
        int i2 = pis.read(ba, 345, 567);
 
        }
        catch(Exception e){}

	}
	public static void test_PipedOutputStream(PipedOutputStream pos) {
        try
        {

        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        pos.write(ba, 234, 33);
        pos.write(55);
       
        }
        catch(Exception e){}
	}
	
	public static void test_PipedReader(PipedReader pr) {
        try
        {

        char[] ch1 = {'a','b'};
        int i1 = pr.read();
        int i2 = pr.read(ch1, 3, 5);

        }
        catch(Exception e){}
	}
	
	public static void test_PipedWriter(PipedWriter pw) {
        try
        {

        char[] ch1 = {'a','b'};
        pw.write(ch1, 3, 5);
        pw.write(87);
        }
        catch(Exception e){}
	}
	
	public static void test_PushbackReader(PushbackReader pbr) {
        try
        {

        char[] ch1 = {'a','b'};
        int i1 = pbr.read();
        int i2 = pbr.read(ch1, 3, 6);
       
       }
        catch(Exception e){}
        
	}
	
	public static void test_PushbackInputStream(PushbackInputStream pis) {
        try
        {

        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        int i1 = pis.read();
        int i2 = pis.read(ba, 3, 6);

       }
        catch(Exception e){}
        
	}
	public static void test_RandomAccessFile(RandomAccessFile raf) {
        try
        {
       
        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        int i1 = raf.read();
        int i2 = raf.read(ba);
     	int i3 = raf.read(ba, 23, 43);
     	boolean bool1 = raf.readBoolean();
     	byte b1 = raf.readByte();
     	char ch1 = raf.readChar();
     	double db1 = raf.readDouble();
     	float ft1 = raf.readFloat();
     	raf.readFully(ba);
     	raf.readFully(ba, 23, 34);
     	int i4 = raf.readInt();
     	String s2 = raf.readLine();
     	long lng1 = raf.readLong();
     	short sh1 = raf.readShort();
     	String s3 = raf.readUTF();
     	int i5 = raf.readUnsignedByte();
        int i6 = raf.readUnsignedShort();
        raf.write(ba);
        raf.write(ba, 34, 45);
        raf.write(44);
        raf.writeBoolean(true);
		raf.writeByte(55);
        raf.writeBytes("string");
        raf.writeChar(8);
        raf.writeChars("string");
        raf.writeDouble(1.0);
        raf.writeFloat(5f);
        raf.writeInt(5);
        raf.writeLong(2l);
        raf.writeShort(4);
        raf.writeUTF("string");
        
       }
        catch(Exception e){}
        
	}
	
	public static void test_Reader(Reader rdr) {
        try
        {

        char[] ch1 = {'a','b'};
        int i1 = rdr.read();
        int i2 = rdr.read(ch1);
        int i3 = rdr.read(ch1, 3, 5);

        }
        catch(Exception e){}
	}
	
	public static void test_SequenceInputStream(SequenceInputStream sis) {
        try
        {

        String s1 = "string"; 
        byte[] ba = s1.getBytes();
        int i1 = sis.read();
        int i2 = sis.read(ba, 3, 6);

       }
        catch(Exception e){}
        
	}
	
	public static void test_StreamTokenizer(StreamTokenizer st) {
        try
        {
        int i1 = st.nextToken();

       }
        catch(Exception e){}
        
	}
	public static void test_Array(Array ar, Map m1, long l1) {
        try
        {
        
        Object obj1 = ar.getArray();
        Object obj2 = ar.getArray(m1);
        Object obj3 = ar.getArray(l1, 5);
        Object obj4 = ar.getArray(l1, 55, m1);
        ResultSet rs1 = ar.getResultSet();
        ResultSet rs2 = ar.getResultSet(m1);
        ResultSet rs3 = ar.getResultSet(l1, 66);
        ResultSet rs4 = ar.getResultSet(l1, 45, m1);

       }
        catch(Exception e){}
        
	}
	public static void test_Blob(Blob blb, long l1, byte[] ba) {
        try
        {

        ba = blb.getBytes(l1, 66);
        int i1 = blb.setBytes(l1, ba);
        int i2 = blb.setBytes(l1, ba, 43, 34);

       }
        catch(Exception e){}
        
	}
	
	public static void test_CallableStatement(CallableStatement cs, long l1, byte[] ba, Map m1, BigDecimal bd1, boolean bl1, byte b1, java.sql.Date dte1, java.util.Calendar cal1 ) 
	{
        try
        {

 
        bd1 = cs.getBigDecimal(66);
        bd1 = cs.getBigDecimal(89, 98);
        bd1 = cs.getBigDecimal("string");
        bl1 = cs.getBoolean(55);
        bl1 = cs.getBoolean("string");
        b1 = cs.getByte(88);
        b1 = cs.getByte("string");
        ba = cs.getBytes(55);
        ba = cs.getBytes("string");
        dte1 = cs.getDate(66);
        dte1 = cs.getDate(56, cal1);
        dte1 = cs.getDate("string");
        dte1 = cs.getDate("string", cal1);
        double dbl1 = cs.getDouble(44);
        double dbl2	= cs.getDouble("string");
        float f1 = cs.getFloat(55);
        float f2 = cs.getFloat("string");
        int i1 = cs.getInt(55);
        int i2 = cs.getInt("string");
        l1 = cs.getLong(66);
        l1 = cs.getLong("string");
        Object obj1 = cs.getObject(55);
        Object obj2	= cs.getObject(44, m1);
        Object obj3 = cs.getObject("string");
        Object obj4 = cs.getObject("string", m1);
        short srt1 = cs.getShort(66);
        short srt2 = cs.getShort("string");
        String s1 = cs.getString(55);
        String s2 = cs.getString("string");
        Time t1 = cs.getTime(77);
        Time t2 = cs.getTime(44, cal1);
        Time t3 = cs.getTime("string");
        Time t4 = cs.getTime("string", cal1);
        Timestamp ts1 = cs.getTimestamp(66);
        Timestamp ts2 = cs.getTimestamp(66, cal1);
        Timestamp ts3 = cs.getTimestamp("string");
        Timestamp ts4 = cs.getTimestamp("string", cal1);
        URL u1 = cs.getURL(88);
        URL u2 = cs.getURL("string");
        cs.setAsciiStream("string", null, 55);
        cs.setBigDecimal("string", bd1);
        cs.setBoolean("string", bl1);
        cs.setByte("string", b1);
        cs.setBytes("string", ba);
        cs.setDate("string", dte1);
        cs.setDate("string", dte1, cal1);
        cs.setDouble("string", dbl1);
        cs.setFloat("string", 2f);
        cs.setInt("string", 67);
        cs.setLong("string", l1);
        cs.setNull("string", 44);
        cs.setNull("string", 66, "string");
        cs.setObject("string", obj1);
        cs.setObject("string", obj1, 44);
        cs.setObject("string", obj1, 44, 66);
        cs.setShort("string", srt1);
        cs.setString("string", "string");
        cs.setTime("string", t1);
        cs.setTime("string", t1, cal1);
        cs.setTimestamp("string", ts1);
        cs.setTimestamp("string", ts1, cal1);
        cs.setURL("string", u1);
        
        }
        catch(Exception e){}   
	}
}

