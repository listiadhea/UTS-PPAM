package lat.pam.letseat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class tampilantiga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilantiga)

        val menuImg5 = findViewById<ImageView>(R.id.menu_img_5)

        menuImg5.setOnClickListener {
            val intent = Intent(this, tampilanempat::class.java)
            startActivity(intent)
        }

    }
}