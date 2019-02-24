package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private double average;
    private String name;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){

        BitcoinDataModel bitcoin = new BitcoinDataModel();


        try {
            bitcoin.average=jsonObject.getJSONObject("averages").getDouble("day");
            bitcoin.name = jsonObject.getString("display_symbol");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        return bitcoin;
    }

    public double getAverage() {
        return average;
    }

    public String getName() {
        return name;
    }
}
