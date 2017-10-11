package com.procreation.dagger2retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sts on 11.10.17.
 */

public interface RestApi {

    @GET("users")
    Call<List<User>> getUsers();
}
