package lat.pam.letseat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tampilandua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilandua)

        val seeMenusButton = findViewById<Button>(R.id.seemenubutton)

        seeMenusButton.setOnClickListener {
            val intent = Intent(this, tampilantiga::class.java)
            startActivity(intent)
        }

    }
}