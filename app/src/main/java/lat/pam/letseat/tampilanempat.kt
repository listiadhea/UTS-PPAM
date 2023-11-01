package lat.pam.letseat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tampilanempat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilanempat)

        val ordernowButton = findViewById<Button>(R.id.ordernowbutton)

        ordernowButton.setOnClickListener {
            // Tindakan yang akan diambil saat tombol ditekan
            // Contoh: Pindah ke tampilan lain (activity)
            val intent = Intent(this, tampilanlima::class.java)
            startActivity(intent)
        }

        val backButton = findViewById<Button>(R.id.backbutton)

        backButton.setOnClickListener {
            // Tindakan yang akan diambil saat tombol ditekan
            // Contoh: Pindah ke tampilan lain (activity)
            val intent = Intent(this, tampilantiga::class.java)
            startActivity(intent)
        }


    }
}