/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495project;


import java.util.*;

/**
 *
 * @author Dylan Veraart
 */
public class User {
  private HashMap<Long,Integer> heights;
  private double targetWeight;
  private HashMap<Long,Double> dailyWeights;
  private String username;
  
  private User(){
    heights=new HashMap();
    dailyWeights=new HashMap();
  }
  
  public User(String username){
    this();
    this.username=username;
  }
  
  public void addHeight(long date, int height){
    heights.put(date, height);
  }
  public void setTargetWeight(double weight){
    targetWeight=weight;
  }
  public void addWeight(long date, double weight){
    dailyWeights.put(date, weight);
  }
  public void setUsername(String user){
    username=user;
  }


  
  public HashMap getHeights(){
    return heights;
  }
  public int getHeight(long date){
    return heights.get(date);
  }
  public double getTargetWeight(){
    return targetWeight;
  }
  public HashMap getDailyWeights(){
    return dailyWeights;
  }
  public double getWeight(long date){
    return dailyWeights.get(date);
  }
  public String getUsername(){
    return username;
  }

  
  public double getCurrentWeight(){
    return dailyWeights.get(Collections.max(dailyWeights.keySet()));
  }
  
  public List getSortedHeightKeys(){
    Set<Long> set = heights.keySet();
    List<Long> dates = new ArrayList<>(set);
    Collections.sort(dates);
    return dates;
  }
  public List getSortedWeightKeys(){
    Set<Long> set = dailyWeights.keySet();
    List<Long> dates = new ArrayList<>(set);
    Collections.sort(dates);
    return dates;
  }
}
