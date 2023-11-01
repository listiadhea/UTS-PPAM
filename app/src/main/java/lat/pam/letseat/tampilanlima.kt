package lat.pam.letseat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class tampilanlima : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilanlima)

        val donebutton = findViewById<Button>(R.id.donebutton)
        donebutton.setOnClickListener {
            fun showPopup() {
                val builder = AlertDialog.Builder(this)
                builder.setMessage("Terima kasih Dhea sudah memesan di toko kami, pesanan Pepperoni Pizza Anda dikirim menggunakan Fast Delivery.")

                val dialog = builder.create()
                dialog.show()
            }
            showPopup()
        }

    }
}