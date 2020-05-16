/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Sreenil A
 */
public class busdetails {

    private int busid;
    private  String from;
    private  String to;
    private Date da;
    private String arrival;
    private String departure;
    private int fare;
    private String type;
    private int seat;

    /**
     * @return the busid
     */
    public int getBusid() {
        return busid;
    }
   

  

    /**
     * @param busid the busid to set
     */
    public void setBusid(int busid) {
        this.busid = busid;
    }

    /**
     * @return the from
     */
   
    /**
     * @return the to
     */
  

    /**
     * @return the da
     */
    public Date getDa() {
        return da;
    }

    /**
     * @param da the da to set
     */
    public void setDa(Date da) {
        this.da = da;
    }

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return the fare
     */
    public int getFare() {
        return fare;
    }

    /**
     * @param fare the fare to set
     */
    public void setFare(int fare) {
        this.fare = fare;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the seat
     */
    public int getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(int seat) {
        this.seat = seat;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }
    
}
