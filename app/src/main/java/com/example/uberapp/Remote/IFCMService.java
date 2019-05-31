package com.example.uberapp.Remote;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type;application/json",
            "Authorization:key=AAAASsSXZAg:APA91bHv_pI28MhELq-wKbBJrXI52hxfjMaTJY1Cpr21iWIUVk8Fo9pIsJg81lGvnWNCZVtJ3fgCCFt_6VBBV5vAydM0XutWHBUEkKzJYmKdQdCVIndZeHQ90lcxA1g85JnnicD6T0eb"
    })
    @POST("fcm/send")
    Call<String> sendMessage(@Body String body);
}
