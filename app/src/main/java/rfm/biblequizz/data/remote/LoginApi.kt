package rfm.biblequizz.data.remote

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import rfm.biblequizz.data.model.LoginRequest
import rfm.biblequizz.data.model.TokenResponse

interface LoginApi {

    @POST("signup")
    suspend fun signUp(
        @Body request: LoginRequest
    )

    @POST("login")
    suspend fun login(
        @Body request: LoginRequest
    ): TokenResponse

    @GET("authenticate")
    suspend fun authenticate(
        @Header("Authorization") token: String
    )

    @GET("/")
    suspend fun test()
}