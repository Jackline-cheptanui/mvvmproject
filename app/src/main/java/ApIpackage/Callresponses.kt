package ApIpackage

import com.google.gson.annotations.SerializedName

data class Callresponses(
    var call:String,
    var addtition:String,
    var subtration:String,
    var muiltiplication:String,
    var division:String,
    @SerializedName("access_token")
    var accessToken:String,

)

