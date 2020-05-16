/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sreenil A
 */
public class booking {

   

    private int bookid;
    private String name;
    private static String busid;
    private static String from;
    private static String to;
    private static String date;
    private int seats;
    private int amount;

    /**
     * @return the bookid
     */
    public int getBookid() {
        return bookid;
    }

    /**
     * @param bookid the bookid to set
     */
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    /**
     * @return the busid
     */
 
  
    /**
     * @return the seats
     */
    public  int getSeats() {
        return seats;
    }

    /**
     * @param Seats the seats to set
     */
    public void setSeats(int Seats) {
        seats = Seats;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
     /**
     * @return the busid
     */
    public static String getBusid() {
        return busid;
    
    }
    

    /**
     * @param aBusid the busid to set
     */
    public static void setBusid(String aBusid) {
        
        busid = aBusid;
    }

    /**
     * @return the from
     */
    public static String getFrom() {
        return from;
    }

    /**
     * @param aFrom the from to set
     */
    public static void setFrom(String aFrom) {
        from = aFrom;
    }

    /**
     * @return the to
     */
    public static String getTo() {
        return to;
    }

    /**
     * @param aTo the to to set
     */
    public static void setTo(String aTo) {
        to = aTo;
    }

    /**
     * @return the date
     */
    public static String getDate() {
        return date;
    }

    /**
     * @param aDate the date to set
     */
    public static void setDate(String aDate) {
        date = aDate;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
