package com.example.uberapp.Common;

import com.example.uberapp.Remote.IGoogleAPI;
import com.example.uberapp.Remote.RetrofitClient;

import retrofit2.Retrofit;

public class Common {
    public  static String currentToken="";
    public static final String driver_tbl="Drivers";
    public static final String pickup_request_tbl="PickupRequest";
    public static final String user_rider_tbl="RidersInformation";
    public static final String user_driver_tbl="UsersInformation";
    public static final String token_tbl="Tokens";
    public static final String baseURL="https://maps.googleapis.com/";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
