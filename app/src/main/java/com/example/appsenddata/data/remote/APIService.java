package com.example.appsenddata.data.remote;
import com.example.appsenddata.data.model.Produto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;


public interface APIService {

    @Headers({"Content-Type:application/json"})
    @POST("produto")
    @FormUrlEncoded
    Call<Produto> saveProduto(@Field("nome") String nome,
                                 @Field("quantidade") int quantidade,
                                 @Field("valor") double valor);

   @POST("produto")
    Call<Produto> salvarProduto(@Body Produto produto);

    @PUT("produto/{id}")
    @FormUrlEncoded
    Call<Produto> updateProduto(@Path("id") long id,
                          @Field("nome") String nome,
                          @Field("quantidade") String quantidade,
                          @Field("valor") String String);

    @DELETE("produto/{id}")
    Call<Produto> deleteProduto(@Path("id") long id);


}
