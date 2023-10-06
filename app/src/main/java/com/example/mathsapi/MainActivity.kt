package com.example.mathsapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mathsapi.databinding.ActivityMainBinding
import com.example.mathsapi.linkedIn.School
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.getBtn.setOnClickListener {
            get()
        }

        setContentView(binding.root)
    }
    private fun get(){
        //LinkedIn School API
        //val requestBody  = RequestData("williamhgates", "Personal","false","false","false")
        val requestBody = RequestData(4)  // Maths API
        val gson = Gson().toJson(requestBody)
        println("TAG--------> $gson")

        MathsInstance.mathsInstance().create(MathsInterface::class.java)
            .getData(gson).enqueue(object : Callback<MathsData?>{
                override fun onResponse(call: Call<MathsData?>, response: Response<MathsData?>) {

                    Log.d("TAG--->",response.toString())
                }

                override fun onFailure(call: Call<MathsData?>, t: Throwable) {
                    Log.d("TAG--->",t.message.toString())
                }

                // LinkedIn School API
//                override fun onResponse(call: Call<School?>, response: Response<School?>) {
//                    Log.d("TAG--->",response.toString())
//                }

//                override fun onFailure(call: Call<School?>, t: Throwable) {
//                    Log.d("TAG--->",t.message.toString())
//                }
            })
    }
    data class RequestData(
        var data : Int
    )

    // LinkedIn School API
//    data class RequestData(
//        var profile_id: String,
//        var profile_type: String,
//        var contact_info: String,
//        var recommendations: String,
//        var related_profiles: String
//    )
}