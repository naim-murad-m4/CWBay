package com.metafour.cwbay.model;

/**
 * Created by MURAD on 1/29/2015.
 */
public class DrawerItem {

    private String title;
    private int icon;
    private String number = "0";
    // boolean to set visiblity of the number
    private boolean isNumberVisible = false;

    public DrawerItem(){}

    public DrawerItem(String title, int icon){
        this.title = title;
        this.icon = icon;
    }

    public DrawerItem(String title, int icon, boolean isNumberVisible, String value){
        this.title = title;
        this.icon = icon;
        this.isNumberVisible = isNumberVisible;
        this.number = value;
    }

    public String getTitle(){
        return this.title;
    }

    public int getIcon(){
        return this.icon;
    }

    public String getNumber(){
        return this.number;
    }

    public boolean getNumberVisibility(){
        return this.isNumberVisible;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setIcon(int icon){
        this.icon = icon;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setNumberVisibility(boolean isNumberVisible){
        this.isNumberVisible = isNumberVisible;
    }
}