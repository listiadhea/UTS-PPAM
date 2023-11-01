package lat.pam.letseat

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.menu_dropdown)
        val adapter = ArrayAdapter.createFromResource(this, R.array.dropdown_items, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                val selectedItem = parentView?.getItemAtPosition(position).toString()
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // Tidak ada yang dipilih
            }
        }


        val submitButton = findViewById<Button>(R.id.submitbutton)

        submitButton.setOnClickListener {
            // Ketika tombol Submit ditekan, pindah ke Activity kedua
            val intent = Intent(this, tampilandua::class.java)
            startActivity(intent)


    }

}}