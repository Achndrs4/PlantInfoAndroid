package com.example.achndrs4.plantme;


/**
 * Created by achndrs4 on 10/13/17.
 */

public class Plant {
    private String sci_name;
    private String common_name;
    private String states_found;
    private String duration;
    private String growth_r;
    private String lifespan;
    private int min_ph;
    private int max_ph;
    private int precip_min;
    private int precip_max;
    private String shade_tolerance;
    private String isChristmasTreeProduct;


    public void setSci_name(String sci_name) {
        this.sci_name = sci_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public void setStates_found(String states_found) {
        this.states_found = states_found;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGrowth_r(String growth_r) {
        this.growth_r = growth_r;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public void setMin_ph(int min_ph) {
        this.min_ph = min_ph;
    }

    public void setMax_ph(int max_ph) {
        this.max_ph = max_ph;
    }

    public void setPrecip_min(int precip_min) {
        this.precip_min = precip_min;
    }

    public void setPrecip_max(int precip_max) {
        this.precip_max = precip_max;
    }

    public void setShade_tolerance(String shade_tolerance) {
        this.shade_tolerance = shade_tolerance;
    }

    public void setIsChristmasTreeProduct(String isChristmasTreeProduct) {
        this.isChristmasTreeProduct = isChristmasTreeProduct;
    }




    public String getSci_name() {
        return sci_name;
    }

    public String getCommon_name() {
        return common_name;
    }

    public String getStates_found() {
        return states_found;
    }

    public String getDuration() {
        return duration;
    }

    public String getGrowth_r() {
        return growth_r;
    }

    public String getLifespan() {
        return lifespan;
    }

    public int getMin_ph() {
        return min_ph;
    }

    public int getMax_ph() {
        return max_ph;
    }

    public int getPrecip_min() {
        return precip_min;
    }

    public int getPrecip_max() {
        return precip_max;
    }

    public String getShade_tolerance() {
        return shade_tolerance;
    }

    public String getIsChristmasTreeProduct() {
        return isChristmasTreeProduct;
    }


    public Plant() {
    }

    public Plant(String sci_name, String common_name, String states_found, String duration, String growth_r, String lifespan, int min_ph, int max_ph, int precip_min, int precip_max, String shade_tolerance, String isChristmasTreeProduct) {
        this.sci_name = sci_name;
        this.common_name = common_name;
        this.states_found = states_found;
        this.duration = duration;
        this.growth_r = growth_r;
        this.lifespan = lifespan;
        this.min_ph = min_ph;
        this.max_ph = max_ph;
        this.precip_min = precip_min;
        this.precip_max = precip_max;
        this.shade_tolerance = shade_tolerance;
        this.isChristmasTreeProduct = isChristmasTreeProduct;

    }
}