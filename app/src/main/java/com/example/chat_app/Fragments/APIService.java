package com.example.chat_app.Fragments;

import com.example.chat_app.Notifications.MyResponse;
import com.example.chat_app.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAQNDP5oA:APA91bGF6JLhc04M_UjX16nLbzw_if_sMa4k93XWb_dDBn-9qLRWJNnpEIesd1gEFQCKo9W5K9uJtpej7DhXLoM_gIIxvG8-tXhb3YS5ETxKCXlkXHeQVMy2hljQ4-mDjLUjoIqfC9d8"
            }
    )

    @POST("fcm/send")
    Call<MyResponse>sendNotification(@Body Sender body);

}
