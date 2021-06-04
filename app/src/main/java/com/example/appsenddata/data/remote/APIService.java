package com.example.appsenddata.data.remote;
import com.example.appsenddata.data.model.Produto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Chike on 12/3/2016.
 */

public interface APIService {

    @POST("/produto")
    @FormUrlEncoded
    Call<Produto> saveProduto(@Field("nome") String nome,
                           @Field("quantidade") String quantidade,
                           @Field("valor") String valor);

    // RxJava
   /* @POST("/posts")
    @FormUrlEncoded
    Observable<Produto> savePost(@Field("title") String title,
                              @Field("body") String body,
                              @Field("userId") long userId);*/

    @POST("/posts")
    Call<Produto> saveProduto(@Body Produto post);

    @PUT("/posts/{id}")
    @FormUrlEncoded
    Call<Produto> updateProduto(@Path("id") long id,
                          @Field("nome") String nome,
                          @Field("quantidade") String quantidade,
                          @Field("valor") String String);

    @DELETE("/posts/{id}")
    Call<Produto> deleteProduto(@Path("id") long id);

}
