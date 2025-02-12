package cordova.kathya.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.cold_drinks) as Button

        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        var btnHot : Button = findViewById(R.id.hot_drinks) as Button

        btnHot.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity2::class.java)
            startActivity(intent)
        }

        var btnSweet : Button = findViewById(R.id.sweets) as Button

        btnSweet.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity3::class.java)
            startActivity(intent)
        }

        var btnSalty : Button = findViewById(R.id.salties) as Button

        btnSalty.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity4::class.java)
            startActivity(intent)
        }

    }
}