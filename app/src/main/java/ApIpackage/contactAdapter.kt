package ApIpackage

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.contactapp.R

class contactAdapter: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addition_list_items)
    }

    var additionintent = intent.getStringExtra("addition")
    var subtrationintent = intent.getStringExtra("subtration")
    var divisionintent = intent.getStringExtra("division")
    var muiltiplicationintent = intent.getStringExtra("muiltiplication")

    var addition = findViewById<TextView>(R.id.tvaddition)
    var subtration = findViewById<TextView>(R.id.tvsub)
    var muiltiplication = findViewById<TextView>(R.id.tvmultiplication)
    var division=findViewById<TextView>(R.id.tvdivision)


}
